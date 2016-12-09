package clockpkg;

import java.util.Scanner;

public class Stock {
	
	
	//boolean cond;
	//boolean cond1;
	public static int mthd(int price[], int size1, int buyP , int sellP){
	    int max = 0;
	    int max_loss = 0;
	    buyP = 0;
	    sellP = 0;
	    for(int i = 0; i< size1; i++){
	        if(price[i]>price[max]){
	        max = i;
	    }
	                   
	    int diff = price[max]-price[i];
	    if(diff>max_loss){
	            sellP = i;
	            buyP = max;
	            max_loss = diff;
	        }
	    }   
	    buyP++;
	    sellP++;
	    System.out.println("Selling_Price_day: "+ sellP + ", Selling price: "+price[sellP++ -1]);   
    	System.out.println("Buying_Price_day: "+ buyP + ", Buying price: "+price[buyP++ -1]);
	    return max_loss;
	    
	}
	     
	public static void main(String [] args){
		
	
	    int size;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter the size of the input data");
	     size = sc.nextInt();
	
	    int [] price_arr = new int [size] ;  
	    for(int i =0; i<size; i++){
	        System.out.println(i+1+":"+"Please enter the price of day" + i+1);
	        price_arr[i] = sc.nextInt();
	           
	        if (price_arr[i] < 0){
	            System.out.println("invalid data, price can not be less than 0");
	            i = i-1;   
	        }
	    }
	   
	   
	    int selling_day_index = 0;
	    int buying_day_index = 0;
	   
	    int max_loss = mthd(price_arr,size,selling_day_index,buying_day_index);
	    if (max_loss == 0){
	       
	        System.out.println("Max_Loss"+":"+ max_loss);
	        System.out.println("No loss can happen with this entries");
	        }
	        else{
	        	System.out.println("Max_Loss"+":" + max_loss);
	        	
	    }
	    

}}
