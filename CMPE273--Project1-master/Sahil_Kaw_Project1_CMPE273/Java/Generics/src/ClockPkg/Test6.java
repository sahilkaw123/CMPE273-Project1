package ClockPkg;

import org.junit.Test;

public class Test6 {
	CacheLRU<Integer, String> cache1 = new CacheLRU<Integer, String>(500);
	@Test
	public void test(){
		
		
		System.out.println(cache1.equals(34));
	}
	
	@Test
	public void test1(){
		
		
		System.out.println(cache1.equals(521));
	}

}
