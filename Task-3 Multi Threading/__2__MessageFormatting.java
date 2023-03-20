import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MessageFormatter{
	
	public void format(String message) {
			try { System.out.println(Thread.currentThread().getName()); Thread.sleep(1000); } catch(Exception e) { }
			
			for(int i=0;i<5;i++)
				System.out.println("[------"+message+"------]");
			
			try { System.out.println("--"+Thread.currentThread().getName()); Thread.sleep(1000); } catch(Exception e) { }
	}
	
}
public class __2__MessageFormatting {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		MessageFormatter mf = new MessageFormatter();
		
		threadPool.execute(()->{
			Thread.currentThread().setName("1st");
			synchronized(mf) {
				mf.format("Kavyapriya");
			}
		});
		threadPool.execute(()->{
			Thread.currentThread().setName("2nd");
			synchronized(mf) {
				mf.format("Sirius");
			}
		});
		threadPool.execute(()->{
			Thread.currentThread().setName("3rd");
			synchronized(mf) {
				mf.format("CDW");
			}
		});
		
		threadPool.shutdown();
		

	}

}
