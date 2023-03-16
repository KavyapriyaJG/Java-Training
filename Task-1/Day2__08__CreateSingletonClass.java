class SingleTon {
	private static SingleTon object;

	private SingleTon(int x) {
		System.out.println("Singleton class constructor called Thread-" + x);
	}

	synchronized public static SingleTon createInstance(int n) {
		// ensure obj created only once
		if (object == null)
			object = new SingleTon(n);

		// everytime returns the instance
		return object;
	}
}

public class Day2__08__CreateSingletonClass {
	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				SingleTon.createInstance(1);
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				SingleTon.createInstance(2);
			}
		}).start();
	}
}