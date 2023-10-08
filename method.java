package exercise_all;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		    
		        
		        printTitle();

		       
		        int result = multiplies(2);
		        System.out.println("Result: " + result);

		    
		        int userNumber = getUserInput();
		        int multipliedValue = multiplies(userNumber);
		        System.out.println("Result of Task 2 method with user input: " + multipliedValue);

		        double width = 5.0;
		        double length = 10.0;
		        calculateAreaAndPrint(width, length);

		       
		        double roomArea = calculateArea(width, length);
		        if (roomArea > 50) {
		            System.out.println("Huge room");
		        } else {
		            System.out.println("Standard room size");
		        }

		        
		        int[] numbers = { 5, 10, 15, 20, 25 };
		        calculateNumbersTotal(numbers);

		       
		        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry", "Date", "Fig"));
		        printListSorted(wordsList);
		    }

		  
		    public static void printTitle() {
		        System.out.println("******************** \n* Method Exercises * \n********************");
		    }

		  
		    public static int multiplies(int value) {
		        return value * 1000;
		    }

		  
		    public static int getUserInput() {
		        return 3;
		    }

		  
		    public static void calculateAreaAndPrint(double width, double length) {
		        double area = width * length;
		        System.out.println("Area: " + area);
		    }

		  
		    public static double calculateArea(double width, double length) {
		        return width * length;
		    }

		  
		    public static void calculateNumbersTotal(int[] numbers) {
		        int total = 0;
		        for (int number : numbers) {
		            total += number;
		        }
		        System.out.println("Total of numbers: " + total);
		    }

		   
		    public static void printListSorted(ArrayList<String> words) {
		        words.sort(String::compareTo);
		        for (String word : words) {
		            System.out.println(word);
		        }
		    }
		}

