import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Inventory {
	static boolean isGoodPresent;

	synchronized public void addProduct() {
		if (isGoodPresent) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Good added..");
		isGoodPresent = true;
		notify();

	}

	synchronized public void consumeProduct() {
		if (!isGoodPresent) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Good consumed");
		isGoodPresent = false;
		notify();
	}

}

public class __3__InventorySystem {

	public static void main(String[] args) {

		Inventory store = new Inventory();
		ExecutorService threadPool = Executors.newFixedThreadPool(4);

		threadPool.execute(() -> {
			store.addProduct();

		});
		threadPool.execute(() -> {
			store.addProduct();
		});

		threadPool.execute(() -> {
			store.consumeProduct();
		});
		threadPool.execute(() -> {
			store.consumeProduct();
		});

		threadPool.shutdown();

	}

}
