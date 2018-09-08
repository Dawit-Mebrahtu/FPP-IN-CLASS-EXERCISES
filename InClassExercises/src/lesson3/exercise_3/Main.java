package lesson3.exercise_3;

public class Main {

	private static int numOfObjects = 0;
	
	public Main() {
		numOfObjects++;
	}
	
	public static int getNumOfObjects() {
		return numOfObjects;
	}

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			new Main();
		}
		
		System.out.println(Main.getNumOfObjects() + " objects created so far.");

	}

}
