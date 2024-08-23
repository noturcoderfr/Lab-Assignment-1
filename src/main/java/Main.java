public class Main {
	public static void main(String[] args) {

		int randNumber = (int) (Math.random() * 50 + 1);
		int x = randNumber;

		if (x % 2 == 0) {
			System.out.println(x + " is even.");
		}

		else {
			System.out.println(x + " is odd.");
		}
		
	} 
	
}