import org.junit.Test;

public class test3 {
	StockAnalyser ab = new StockAnalyser();
	
	StockNotifier xy = new StockNotifier(ab);
	
	@Test
	public void test(){
	
		ab.setLAMPrice(2443);
		ab.setSJSUPrice(23333);
		ab.setTCSPrice(434);
		ab.setYahooPrice(323);
		
		
	}
	@Test
	public void test2(){
		ab.setLAMPrice(634);
		ab.setSJSUPrice(333);
		ab.setTCSPrice(4324);
		ab.setYahooPrice(32223);	
			
		
		
	}
	@Test
	public void test3(){
		ab.setLAMPrice(6341);
		ab.setSJSUPrice(111);
		ab.setTCSPrice(424);
		ab.setYahooPrice(323);
			
			
	
		
	}
}
	


