import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Count{

		public static void even() {	
			synchronized(__1__OddEvenThread.class) {
				for(int number=0;number<=100;number+=2) {
					System.out.print(number+" ");
				}
				System.out.println();
			}
		}
		public static void odd() {
			synchronized(__1__OddEvenThread.class) {
				for(int number=1;number<=100;number+=2) {
					System.out.print(number+" ");
				}
				System.out.println();
			}
		}
	
}

public class __1__OddEvenThread {
	public static void main(String[] args) {
		Count count = new Count();
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			count.even();
		});
		
		es.execute(()->{
			count.odd();	
		});
		
		es.shutdown();
	}

}
