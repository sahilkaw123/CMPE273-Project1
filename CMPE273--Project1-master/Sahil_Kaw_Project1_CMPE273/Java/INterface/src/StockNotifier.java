
public class StockNotifier implements Analyser {

	private double YahooPrice;
	private double TCSPrice;
	private double LAMPrice;
	private double SJSUPrice;

	// Static used as a counter
	private static int observerIDTracker = 0;	     
	// Used to track the observers
	private int observerID;    
	
	@SuppressWarnings("unused")
	private PriceSubject sg;

	//Parameterized Constructor initialization
	//This means that when any constructor of the class Observer is created, it will be fed an object of the class Subject
	StockNotifier(PriceSubject sg) {
		this.observerID = ++observerIDTracker;
		System.out.println("Analyser created : "+this.observerID);
		sg.register(this);
	}
	
	@Override
	public void update(double YahooPrice, double TCSPrice, double LAMPrice, double SJSUPrice) {
		this.YahooPrice = YahooPrice;
		this.TCSPrice = TCSPrice;
		this.LAMPrice = LAMPrice;
		this.SJSUPrice = SJSUPrice;
		
		printtheprices();
	}

	public void printtheprices() {
		System.out.println(observerID + "\nYAHOO: " + YahooPrice + "\tTCS: " +TCSPrice + "\tLAM: " + LAMPrice + "\tSJSU: " + SJSUPrice + "\n");
	}
}

