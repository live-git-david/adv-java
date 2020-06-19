package multithreading;

public class Coordinator {
	public void start_up() {
		// call trainer
		Trainer trainer = new Trainer("Mark", "markrob@yahoo.com");
		trainer.start();
		try {
			trainer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void end() {
		System.out.println("Well that concludes today's activities!");
	}
}
