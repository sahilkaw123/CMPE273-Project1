package ClockPkg;
import java.util.*;

import java.io.*;
import java.lang.*;


public class CacheLRU<Key, Record> {
	static int Cachehits = 0;
	static int CacheMiss = 0;
	int capacity; // actual capacity of the cache // doubly linked list
	int full; // increases with the increase in the node in linked list
	//Hashtable is used to fetch the record from the cache using the keys
	HashMap<Key, Value> tbl;
	//Linked list for LRU
	Node head;
	Node tail;
	
	public CacheLRU(int size){
		capacity = size;
		tbl = new HashMap<Key, Value>(size);
	}
	// produce a new record 
		private static String produce_new_val(int key) {
			String s = ""; 
			float b = 1;
			for (int k =0; k<30; k++){
			b *= Math.random();	
				s+=((char)(b*100000 +(int)'c'));
			}
			return s;
		}
	
	public static void main(String[]args){
		CacheLRU<Integer, String> LRU = new CacheLRU<Integer,String>(100);
		for (int i =0;i<60;i++){
		float keyGen = 1;
		//for(int k=0;k<5;k++){
		keyGen *=Math.random();
	//}
		int key = (int)(keyGen*10000);
		
		String val = LRU.fetch(key);
		if (val == null){
			//if it is not in the cache then add it to cahce and if the cache is full
			//replace it with the Least Recently used
			// add Cache miss count too.
			val = produce_new_val(key); // produce a value which is equivalent to fetching value
			//from the server in real world
			LRU.add(key, val); // add the value to the cache
			CacheMiss++; // If value not found with the key then its a miss
		}
		else{
			//the value is present in the cache, so its a hit
			Cachehits++;
			
		}
		}
	
		System.out.println(LRU);
		System.out.println("No of Cache Hits" + Cachehits +"\n"+"No of Cache Misses" + CacheMiss);
	}
	
	

	

	private void add(Key key, Record val) {
		Value v = new Value(val);
		Node n = new Node(key);
		v.node = n;
		tbl.put(key, v);
		// place the newly added item to the head of the queue
		n.next = head;
		if(head!=null)
			head.prev = n;
		head = n;
		
		//Only one iteem in the queue then head and tail at same position
		if(tail==null)
			tail = head;
		full++;
		
		//checking if full exceeds capacity
		if(full > capacity){
			Node a = tail.prev;
			tail.delEntryfromTable();
			tail.delFromTailofList();
			tail = a;
			full--;
		}
		
		
	}



	
	

	

	private Record fetch(Key key) {
		Value r =  tbl.get(key); // get method of the 
		if (r == null)
			return null;
		
		Node n = r.node; // move this node to head of the queue
		n.delFromTailofList();
		n.next = head;
		if (head!=null)
			head.prev = n;
		
		head = n;
		return r.rec;
	}
//doubly linked list
	public class Node{
		Node next;
		Node prev;
		Key key;

		public Node(Key k){
			key = k;
		}
		//LRU used move the value to the head if the data is found in cache
		void delFromTailofList(){
			if(this == head)
				head = next;
			if(this == tail)
				tail = prev;
			if(prev!=null)
				prev.next = prev;
			if(next!=null)
				next.prev = prev;
			next = null;
			prev = null;
			
			
			
		}
		void delEntryfromTable(){
			tbl.remove(key);
			
		}
}
	//Grouping 
	public class Value{
		public Value(Record t){
			rec = t;
			
		}
		Node node;
		Record rec;
		}
	public String toString(){
		Node node = head;
		String s = "Cache Input:" + node.key;
		
		while(node != tail){
			node = node.next;
			if(node==null){
				break;
			}
			s+=", " + node.key;
		}
		return s ;
	}
	
	}
