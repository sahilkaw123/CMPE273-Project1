package clockpkg;

public class MinThread implements Runnable{
	private AlarmClock clock;
	
	public MinThread(AlarmClock clock){
		this.clock = clock;
	}

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			clock.moveMin();
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
	}
}

	
	
