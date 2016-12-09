
public class Stocks {

	public static void main(String[] args) {
		StockAnalyser s = new StockAnalyser();
		@SuppressWarnings("unused")
		StockNotifier o1 = new StockNotifier(s);
		
		s.setYahooPrice(325.0);
		s.setTCSPrice(343.7);
		s.setLAMPrice(275.9);
		s.setSJSUPrice(400.9);
		
		@SuppressWarnings("unused")
		StockNotifier o2 = new StockNotifier(s);
		
		s.setYahooPrice(325.0);
		s.setTCSPrice(343.7);
		s.setLAMPrice(275.9);
		s.setSJSUPrice(400.9);
		

	}

}



