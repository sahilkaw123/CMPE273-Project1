package clockpkg;

public class HourThread implements Runnable{
	private AlarmClock clock;
	
	//contructor
	
	public HourThread(AlarmClock clock){
		this.clock = clock;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			clock.moveHour();
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	

}
