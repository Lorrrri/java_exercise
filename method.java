package exercise_all;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		    
		        // Task 1: Print Title
		        printTitle();

		        // Task 2: Multiply by 1000
		        int result = multiplies(2);
		        System.out.println("Result: " + result);

		        // Task 3: Call Task 2 method from here
		        int userNumber = getUserInput();
		        int multipliedValue = multiplies(userNumber);
		        System.out.println("Result of Task 2 method with user input: " + multipliedValue);

		        // Task 4: Calculate Area
		        double width = 5.0;
		        double length = 10.0;
		        calculateAreaAndPrint(width, length);

		        // Task 5: Calculate Area and Check Size
		        double roomArea = calculateArea(width, length);
		        if (roomArea > 50) {
		            System.out.println("Huge room");
		        } else {
		            System.out.println("Standard room size");
		        }

		        // Task 6: Calculate Numbers Total from an Array
		        int[] numbers = { 5, 10, 15, 20, 25 };
		        calculateNumbersTotal(numbers);

		        // Task 7: Print List Sorted
		        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry", "Date", "Fig"));
		        printListSorted(wordsList);
		    }

		    // Task 1
		    public static void printTitle() {
		        System.out.println("******************** \n* Method Exercises * \n********************");
		    }

		    // Task 2
		    public static int multiplies(int value) {
		        return value * 1000;
		    }

		    // Task 3
		    public static int getUserInput() {
		        // Simulating user input for demonstration purposes
		        return 3;
		    }

		    // Task 4
		    public static void calculateAreaAndPrint(double width, double length) {
		        double area = width * length;
		        System.out.println("Area: " + area);
		    }

		    // Task 5
		    public static double calculateArea(double width, double length) {
		        return width * length;
		    }

		    // Task 6
		    public static void calculateNumbersTotal(int[] numbers) {
		        int total = 0;
		        for (int number : numbers) {
		            total += number;
		        }
		        System.out.println("Total of numbers: " + total);
		    }

		    // Task 7
		    public static void printListSorted(ArrayList<String> words) {
		        words.sort(String::compareTo);
		        for (String word : words) {
		            System.out.println(word);
		        }
		    }
		}

