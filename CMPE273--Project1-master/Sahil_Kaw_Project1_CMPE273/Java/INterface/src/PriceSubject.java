public interface PriceSubject {
	
	public void register(Analyser o);
	public void unregister(Analyser o);
	public void notifyObserver();

}

