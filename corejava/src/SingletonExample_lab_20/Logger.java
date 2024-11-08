package SingletonExample_lab_20;

public class Logger {
	public static Logger log;
	
	private Logger() { //private constructor  dis-allow to create object
		
	}
	public static Logger getLogIn() { //Method create object for only once
		if(log == null) {
			log = new Logger();
			System.out.println("Logging successful....\n");
		}
		return log; //return object
	}

}
