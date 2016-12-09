package clockpkg;

public class AlarmClock {
	
	private static Integer hours = 23;
	private static Integer minutes = 59;
	private static Integer seconds = 59;
	private static boolean threadHourUpdate = false;
	private static boolean threadMinUpdate = false;
	
	
	final static Object lock = new Object();
	
	
	
	public boolean moveSeconds() throws InterruptedException{
		synchronized(lock){
			while(true){
			if(threadMinUpdate || threadHourUpdate) {
				lock.wait();
			}else {
				Thread.sleep(1000);
				seconds++;
				if(seconds == 60){
					seconds = 0;
					threadMinUpdate = true;
					lock.notifyAll();
				}else{
					displayTime();
				}
			}
			
		}
		
	}

}

public void moveMin() throws InterruptedException{
	synchronized(lock){
		while(true){
			if(!threadMinUpdate){
				lock.wait();
			}else if(threadMinUpdate){
				minutes++;
				threadMinUpdate = false;
				if (minutes == 60){
					minutes = 0;
					threadHourUpdate = true;
					
				}else{
					displayTime();
				}
			}
			lock.notifyAll();
		}
		
	}
}


public void moveHour() throws InterruptedException{
	synchronized(lock){
		while(true){
			if(!threadHourUpdate){
				lock.wait();
			}else if(threadHourUpdate){
				hours++;
				threadHourUpdate = false;
				if(hours == 24){
					hours = 0;
				}
				else{
				displayTime();
			}}
			
			lock.notifyAll();
		}
		
		
		
	}
}
public void displayTime(){
	System.out.println(hours+":"+minutes+":"+seconds);
}


}