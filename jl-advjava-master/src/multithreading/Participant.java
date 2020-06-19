package multithreading;

public class Participant extends Thread {
	private int ID;
	private String name;

	public Participant(int iD, String name) {
		ID = iD;
		this.name = name;
		System.out.println("Hello Everyone! My name is " + this.name + " ID " + ID);
	}

	// particpant start to practice after trainer is done with lecture
	@Override
	public void run() {
		practice();
	}

	public void practice() {

		System.out.println("This is a good workout from " + this.name + ".");
		System.out.println("Yay got my toss in!");

	}
}
