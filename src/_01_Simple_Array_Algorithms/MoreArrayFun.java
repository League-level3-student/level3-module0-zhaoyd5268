package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] list = new String[4];
		list[0] = "watermelon";
		list[1] = "peach";
		list[2] = "pear";
		list[3] = "apple";
		print(list);
		printreverse(list);
		printeveryother(list);
		printrandomorder(list);
	}    
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void print(String[] strings) {
		for(int i = 0; i< strings.length; i++) {
			System.out.println(strings[i]);
		}
	}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public static void printreverse(String[] strings) {
		for(int i = strings.length-1; i>-1; i--) {
			System.out.println(strings[i]);
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printeveryother(String[] strings) {
		for(int i = 0; i< strings.length; i++) {
			if (i%2 ==0) {
				System.out.println(strings[i]);
			}
		}
	}
    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	public static void printrandomorder(String[] strings) {
		Random ran = new Random();
		for(int i = 0; i< strings.length; i++) {
			int index = ran.nextInt(strings.length);
			System.out.println(strings[index]);
		}
	}

}
