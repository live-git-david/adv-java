package multithreading;

public class RunnableLambda {

	public static void main(String[] args) {

		new Thread(() -> System.out.println("Wow, this is awesome...")).start();
		Animal animal = new Animal();

		Animal animal2 = (Animal) animal.clone();
	}

}