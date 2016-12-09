package clockpkg;

import org.junit.Test;

public class test_fin {
	
	
	StringEvalUsingStack sc = new StringEvalUsingStack();
	
		@Test
		public void test1() 	{ //72
			System.out.println(sc.calculate("60 + 3 * 4"));
			
		}
		@Test
		public void test2() 	{ //68
			System.out.println(sc.calculate("20 + 12 * 4"));
		}
		@Test
		public void test3() 	{ //30
			System.out.println(sc.calculate("30 + 12 * 0"));
		}
		@Test
		public void test4() 	{ //68
			System.out.println(sc.calculate("23/2"));
		}
		}
			
			
		
		
	
		
		