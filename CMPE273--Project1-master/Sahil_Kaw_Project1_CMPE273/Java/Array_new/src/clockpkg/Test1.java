package clockpkg;

import org.junit.Test;



public class Test1 {
	
	@Test
	public void test(){
		
		
		System.out.println(Stock.mthd(new int[]{54,43,42,54,65,21},6,0, 0));
	}
	@Test
	public void test2(){
			
			
	System.out.println(Stock.mthd(new int[]{54,43,42,54,60,21},6,54, 21));	
		
	}
	@Test
	public void test3(){
			
			
	System.out.println(Stock.mthd(new int[]{54,65,66,67,87,98},6,0, 0));	
		
	}
}
	


