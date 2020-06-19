package multithreading;

public class Trainer extends Thread {

	private String name;
	private String email;

	public Trainer(String name, String email) {
		super();
		this.name = name;
		this.email = email;

		System.out.println("Hello everyone, my name is " + this.name + ".");
		System.out.println("I will be your trainer this afternoon!");
		System.out.println("You can reach me at " + this.email + ".");
	}

	@Override
	public void run() {
		// trainer organizes its partipants
		Participant[] participants = new Participant[5];

		participants[0] = new Participant(0, "David");
		participants[1] = new Participant(1, "Brian");
		participants[2] = new Participant(2, "Dasha");
		participants[3] = new Participant(3, "Arturo");

		participants[4] = new Participant(4, "Jocelyn");

		// trainer starts with today's lecture
		lecture();
		// participants start their practice
		for (Participant each : participants) {
			each.start();
		}

		for (Participant eachParticipant : participants) {

			try {
				eachParticipant.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		last_remarks();
	}

	public void lecture() {

		System.out.println("Today we will be going over the serve");
		System.out.println("We will work on the toss. To toss make sure the ball is not spinning!");
		System.out.println("Now you try!");
	}

	public void last_remarks() {

		System.out.println("Now that you have learned the toss, go do it at home!");
	}
}
