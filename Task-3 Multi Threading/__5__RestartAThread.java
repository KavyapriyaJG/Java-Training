
public class __5__RestartAThread {

	public static void main(String[] args) {
		
		Thread thread = new Thread(()->{System.out.println("Thread started");});
		
		thread.start();
		//thread.stop();
		
		//Restarting
		thread.start();

	}

}
