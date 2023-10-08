package exercise_all;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Exercise 1

		1. Create 1-dimensional array and assign furnitures as values (like table, chair, shelf…).

		2. Print the whole array to the Console.

		3. Change the app so that only first two elements of the array are printed. 
		This can be done by editing the for loop.

		4. Change the app so that only “Sofa” is printed if it is found from the array. 
		So, go through the whole array and check if the current element is “Sofa”
*/
String furnitures [] = {"table","chair","shelf","sofa","window"}; //creat array
for (String furniture:furnitures) {
	System.out.println(furniture);  //print the whole array
	

}

System.out.println("--------------");

for (int i = 0;i < 2;i++) {
	System.out.println(furnitures[i]); // only two elements
}

System.out.println("--------------");

for (String furniture:furnitures) {
	if (furniture.equals("sofa")) {
		System.out.println("sofa");  // only print sofa
	}

}
		//exercise 1
}
}

