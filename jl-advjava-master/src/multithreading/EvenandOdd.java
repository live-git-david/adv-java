package multithreading;

public class EvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildThread thread1 = new ChildThread();
		ChildThread thread2 = new ChildThread();
		thread1.setName("child thread 1");
		thread2.setName("child thread 2");

		thread1.start();
		thread2.start();
	}

}
