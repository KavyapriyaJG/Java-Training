class CountingThread extends Thread{
	@Override
	public void run() {
		int count=1;
		
		while(count<=100) {
			try {
				System.out.println(count+" ");
				if(count%10==0)
					System.out.println("--- count reached");
				count++;
				
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {System.out.println(e);}
		}
		
	}
	
}
public class __7__CountingThread {

	public static void main(String[] args) {
		CountingThread countingThread = new CountingThread();
		
		countingThread.start();
	}

}
