package clockpkg;

import org.junit.Test;

public class test_case {
	
	
		
	AlarmClock clock1 = new AlarmClock();
	running r = new running();
		@Test
		public void test1() throws Throwable	{
			
			clock1.moveMin();
		
		
	}
		@Test
		public void test() {
			try {
				System.out.println(clock1.moveSeconds());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		
		@Test
		public void test2() throws InterruptedException{
			clock1.moveHour();
			
			
		}
		
		@Test
		public void test3(){
			clock1.notifyAll();
		}
		@Test
		public void test4(){
		
			r.main(null);
			
		}
		
		
		}