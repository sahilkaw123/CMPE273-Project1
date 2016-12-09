package clockpkg;

public class running {
	public static void main(String[] args){
		AlarmClock clock = new AlarmClock();
		
		new Thread(new SecThread(clock)).start();
		new Thread(new MinThread(clock)).start();
		new Thread(new HourThread(clock)).start();
	}

}
