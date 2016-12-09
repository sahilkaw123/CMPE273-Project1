import java.util.ArrayList;

class StockAnalyser implements PriceSubject {
	
	//Create an arraylist to store observers
	private ArrayList<Analyser> analysers;
	private double YahooPrice;
	private double TCSPrice;
	private double LAMPrice;
	private double SJSUPrice;

	//Creating a constructor to initialize the ArrayList
	StockAnalyser() {
		analysers = new ArrayList<Analyser>();
	}
	
	//Registering a new observer
	public void register(Analyser newObserver) {
		
		analysers.add(newObserver);
	}
	
    //Deleting a Observer from the list
	public void unregister(Analyser deleteObserver) {
		//Get the index of the observer in the arraylist to delete it
		int x = analysers.indexOf(deleteObserver);
		System.out.println("Deleted Analyser : "+(x+1));
		analysers.remove(x);
	}
    
	//Notifying an observer. We will call the update method inside the Observer class although this class implements Subject.
	//This is because the our ArrayList has the datatype of Observer class
	public void notifyObserver() {
		for(Analyser i : analysers) {
			i.update(YahooPrice, TCSPrice, LAMPrice,SJSUPrice);
		}
		
	}
	
	//Option for the user to manually set stock prices 
	public void setYahooPrice(double price) {
		
		this.YahooPrice = price;
		//Notify the observer regarding the changes
		notifyObserver();
	}
	
	
	//Apple setter
	public void setTCSPrice(double price) {
		this.TCSPrice = price;
		//Notify the observer regarding the changes
		notifyObserver();
	}
	//Google setter
	public void setLAMPrice(double price) {
		this.LAMPrice = price;
		//Notify the observer regarding the changes
		notifyObserver();
	}
	
	public void setSJSUPrice(double price) {
		this.SJSUPrice = price;
		//Notify the observer regarding the changes
		notifyObserver();
	}


}

