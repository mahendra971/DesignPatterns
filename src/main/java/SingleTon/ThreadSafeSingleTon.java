package SingleTon;

public class ThreadSafeSingleTon {
	private static volatile ThreadSafeSingleTon instance = null;
	
	private ThreadSafeSingleTon() {
		
		if(instance != null)
			throw new RuntimeException("Use get instance method to Create");
	}
	
	public static ThreadSafeSingleTon getInstance()
	{
		if(instance == null)
		{
			synchronized (ThreadSafeSingleTon.class) {
				if(instance == null)
					instance = new ThreadSafeSingleTon();
			}
		}
		return instance;
	}

}
