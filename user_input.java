
package exercise_all;
import java.util.Scanner;
public class user_input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub

System.out.println("Please,give the value of 1st number");
int num1 = scanner.nextInt(); //first number

System.out.println("Please,give the value of 2nd number");
int num2 = scanner.nextInt(); //second number

System.out.println("Would you like to calculate the sum or substraction.Please type plus or minus.");
scanner.nextLine();
String answer = scanner.nextLine(); //ask question

if (answer.equals("plus")) {
	int sum = num1 + num2;
	if (sum > 10) {
		System.out.println("The value is greater than 10.It is " + sum);//the sum greater than 10
	}
	else {
		System.out.println(sum);
	}
} //type plus

else if(answer.equals("minus")) {
	int sub = num1 - num2;
	System.out.println("The result is "  + sub);
} //type minus

else {
	System.out.println("You didn't type any valid answer");
} //no plus and minus




	}

}
