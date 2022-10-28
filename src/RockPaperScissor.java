import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String[] n = {"Rock","Paper","Scissor"};
		boolean loop = true;
		
		System.out.println("USE : Rock, Paper, Scissor.");
		
		while(loop) {
			
			int i = random.nextInt(3);
			String myChoice = scanner.next();
			//when computer choose rock
			if(n[i]=="Rock") {
				
				//System.out.println("COMPUTER CHOSE ROCK");
				switch(myChoice) {
				
				case "Rock" :
					System.out.println("DRAW");
					break;
				case "Scissor" :
					System.out.println("YOU LOSE");
					break;
				case "Paper" :
					System.out.println("YOU WIN");
					break;	
				default : 
					System.out.println("USE A VALID OPTION!");
					
				}
				
			}
			//when computer choose paper
			if(n[i]=="Paper") {
				
				//System.out.println("COMPUTER CHOSE PAPER");
				switch(myChoice) {
				
				case "Rock" :
					System.out.println("YOU LOSE");
					break;
				case "Scissor" :
					System.out.println("YOU WIN");
					break;
				case "Paper" :
					System.out.println("DRAW");
					break;	
				default : 
					System.out.println("USE A VALID OPTION!");
					
				}
				
			}
			//when computer choose scissor
			if(n[i]=="Scissor") {
				
				//System.out.println("COMPUTER CHOSE SCISSOR");
				switch(myChoice) {
				
				case "Rock" :
					System.out.println("YOU WIN");
					break;
				case "Scissor" :
					System.out.println("DRAW");
					break;
				case "Paper" :
					System.out.println("YOU LOSE");
					break;	
				default : 
					System.out.println("USE A VALID OPTION!");
					
				}
	
			}
			
		}
		scanner.close();
	}

}
