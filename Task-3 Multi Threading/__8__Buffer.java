import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadClass extends Thread{
	StringBuffer sb;
	MyThreadClass(StringBuffer sb){
		this.sb = sb;
	}
	synchronized public void run(StringBuffer sb) {
		for(int i=0;i<100;i++) {
			System.out.print(sb+" ");
		}
		char character = sb.charAt(0);
		
		sb.setCharAt(0, (char) (character+1));
		
		System.out.println("\n"+sb.length());
	}
}
public class __8__Buffer {
	public static void main(String[] args) {
		StringBuffer sbr = new StringBuffer("A");
		
		MyThreadClass mtc = new MyThreadClass(sbr);
		
		ExecutorService thread = Executors.newFixedThreadPool(3);
		
		thread.execute(()->{
			mtc.run(sbr);
		});
		thread.execute(()->{
			mtc.run(sbr);
		});
		thread.execute(()->{
			mtc.run(sbr);
		});
		
		thread.shutdown();
	}
}
