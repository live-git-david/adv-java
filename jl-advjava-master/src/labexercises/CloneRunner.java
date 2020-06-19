package labexercises;

public class CloneRunner {

	public static void main(String[] args) {

		CloneExercise c1 = new CloneExercise();
		CloneExercise c2 = (CloneExercise) c1.clone();

		System.out.println("c1: " + c1.toString());
		System.out.println("c2: " + c2.toString());
		int[] array1 = c1.getNums();
		int[] array2 = c2.getNums();
		array2[1] = 3;
		c2.setNums(array2);

		System.out.println("c1: " + c1.toString());
		System.out.println("c2: " + c2.toString());
	}

}
