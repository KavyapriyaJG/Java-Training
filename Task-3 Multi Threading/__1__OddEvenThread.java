import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Count{

		public static void even() {	
				for(int number=0;number<=100;number+=2) {
					System.out.print(number+" ");
				}
				System.out.println();
		}
		public static void odd() {
				for(int number=1;number<=100;number+=2) {
					System.out.print(number+" ");
				}
				System.out.println();
		}
	
}

public class __1__OddEvenThread {
	public static void main(String[] args) {
		Count count = new Count();
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			synchronized(count) {
				count.even();
			}
		});
		
		es.execute(()->{
			synchronized(count) {
				count.odd();	
			}
		});
		
		es.shutdown();
	}

}
