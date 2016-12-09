package clockpkg;

public class SecThread implements Runnable {
	private AlarmClock clock;
	//constructor
	public SecThread(AlarmClock clock){
		this.clock = clock;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			clock.moveSeconds();
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	

}
