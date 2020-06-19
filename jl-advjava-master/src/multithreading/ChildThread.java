package multithreading;

public class ChildThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (Thread.currentThread().getName().equals("child thread 1")) {
			try {

				for (int i = 1; i <= 10; i++) {

					if (i % 2 == 0) {
						System.out.println("even: " + i);
					}
				}

				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		else if (Thread.currentThread().getName().equals("child thread 2")) {
			try {

				for (int i = 1; i <= 10; i++) {
					if (i % 2 != 0) {

						System.out.println("odd: " + i);
					}
				}

				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
