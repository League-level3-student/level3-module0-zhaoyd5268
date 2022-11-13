package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] burgers = new String[5];

		burgers[0] = "hamburger";
		burgers[1] = "cheeseburger";
		burgers[2] = "baconater";
		burgers[3] = "impossible burger";
		burgers[4] = "BLT";

		// 2. print the third element in the array
		System.out.println(burgers[2]);
		// 3. set the third element to a different value
		burgers[2] = "minecraft burger";
		// 4. print the third element again
		System.out.println(burgers[2]);

		// 5. use a for loop to set all the elements in the array to a string
		// of your choice

		for (int i = 0; i < burgers.length; i++) {
			burgers[i] = "Tate burger";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for (int i = 0; i < burgers.length; i++) {
			System.out.println(burgers[i]);
		}

		// 7. make an array of 50 integers
		
		int[] numbers = new int[51]; 

		// 8. use a for loop to make every value of the integer array a random
		// number
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(51);
			System.out.println(numbers[i]);
		}
		int smallestcurrentnum = 100;
		int largestcurrentnum = -5;
		int lastnum = 0;
		// 9. without printing the entire array, print only the smallest number
		// on the array

		for(int i = 0; i< numbers.length; i++) {

			if (numbers[i] < smallestcurrentnum) {
				smallestcurrentnum = numbers[i];
			}
			if (numbers[i] > largestcurrentnum) {
				largestcurrentnum = numbers[i];
			}
			lastnum = numbers[i];
		}

		System.out.println("The smallest number is " + smallestcurrentnum);
		System.out.println("The largest number is " + largestcurrentnum);
		
		// 10 print the entire array to see if step 8 was correct

		// 11. print the largest number in the array.

		// 12. print only the last element in the array
		System.out.println("The last numbers in the list is " + numbers[50]);
		
	}
}
