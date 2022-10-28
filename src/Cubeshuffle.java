import java.util.Random;
public class Cubeshuffle {

	public static void main(String[] args) {
		
		Random random = new Random();
		String[] moves = {"R","R'","L","L'","U","U'","F","F'","B","B'","D","D'"};
		int n = random.nextInt(15,30);
		
		while(n!=0) {
			int i = random.nextInt(12);
			System.out.print(moves[i]);
			n--;
			//random comment to check to see if editing works
		}
	}

}
