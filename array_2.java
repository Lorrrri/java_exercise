
package exercise_all;
import java.util.Random;

public class array_2 {

	public static void main(String[] args) {
		Random random = new Random();
	/*Exercise 2

1. Create 1-dimensional & 5 element array (The length of the array is 5). Name it thrownDiceNumbers.

2. Pick randomly 5 numbers and assign them to the array.

3. If you didn’t do the previous part using for loop, do it now

4. Print the whole array to the Console.

5. Count the sum of the array values and print the result to the Console.

6. Print the highest value to the Console.
*/
		int [] thrownDiceNumbers = new int [5];
		
		int sum = 0;
		int max = 0;
		System.out.println("The whole number is: ");
		for (int i = 0;i < thrownDiceNumbers.length;i ++) {
			thrownDiceNumbers[i] = random.nextInt(6) + 1;  //five random number
			
			System.out.println(thrownDiceNumbers[i]);   //whole array
			sum += thrownDiceNumbers[i];  //count sum
			
			
			for (int num:thrownDiceNumbers) {
				if (num > max) {
					max = num;	
				}
			}
		}
		System.out.println("The sum is: ");
		System.out.println(sum); //print out the sum
		
		System.out.println("the max is: ");
		System.out.println(max);  //the max number 
		
	
		
    }

	}


