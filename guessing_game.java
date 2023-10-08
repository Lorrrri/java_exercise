package exercise_all;
import java.util.Scanner;
public class guessing_game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
	
String name = "Lori";
String answer = " ";
int count = 0;
//guess a name

while(true) {
	System.out.println("Please guess my name");
	count ++;
	answer = scanner.nextLine();
	
	if (answer.equals(name)) {
		System.out.println("Congratulations!");
		break;
		} //right answer
	
	else {
			System.out.println("Do you want to quit?(y/n)"); //whether want to quit
			answer = scanner.nextLine();
			if (answer.equals("y")) {
			break;
			} //if want to quit
			
			else if(answer.equals("n")) {	
			} //don't want to quit
			
			else {
				System.out.println("valid");
				break; // not y or n
			}
		}
	}
	System.out.println("Thanks for playing");
	System.out.println("Guesses: " + count);  //end the game
	
	
	    }
	}

	

