package exercise_all;
import java.util.Random;
import java.util.Scanner;
public class lucky7 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
		// TODO Auto-generated method stub

		int money = 0;

        
        
        
        System.out.print("How much money do you want to spend? ");
        int f_Money = scanner.nextInt();
        money = f_Money;
        
        while (money > 0) {
            
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int num3 = random.nextInt(10) + 1;
            
            System.out.println("Random numbers: " + num1 + ", " + num2 + ", " + num3);

            
            if (num1 == 7 || num2 == 7 || num3 == 7) {
                if (num1 == 7 && num2 == 7 && num3 == 7) {
                	money += 10;
                    System.out.println("You won 10!now you have: " + money + "€");
                    
                } else if (num1 == 7 || num2 == 7 || num3 == 7) {
                	money += 3;
                    System.out.println("You won 3!now you have: " + money + "€");
                    
                } else {
                	money += 5;
                    System.out.println("You won 5!now you have: " + money + "€");
                    
                }
            } else {
            	money -= 1;
                System.out.println("You lost!now you have: " + money + "€");
                
            }
            
           

           
            System.out.print("Do you want to play again? (y/n): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Game Over. Your final balance is: " + money + "€");
        scanner.close();
    }
}
