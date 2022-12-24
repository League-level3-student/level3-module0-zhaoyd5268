/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		int[] returnCows;
		int upX = 0;
		int upY = 0;
		int downX = 0;
		int downY = 0;
		int leftX = 0;
		int leftY = 0;
		int rightX = 0;
		int rightY = 0;
		int rightCows = 0;
		int leftCows = 0;
		int downCows = 0;
		int upCows = 0;
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++)
				if (field[i][j] == 'c') {
					if (i + 1 < field.length && field[i + 1][j] == 'o') {
						if (i + 2 < field.length && field[i + 2][j] == 'w') {
							downX = i;
							downY = j;
							downCows += 1;
						}
					}
					if (j + 1 < field[i].length && field[i][j + 1] == 'o') {
						if (j + 2 < field[i].length && field[i][j + 2] == 'w') {
							rightX = i;
							rightY = j;
							rightCows += 1;
						}
					}
					if (j - 1 > -1 && field[i][j - 1] == 'o') {
						if (j - 2 > -1 && field[i][j - 2] == 'w') {
							leftX = i;
							leftY = j;
							leftCows += 1;
						}
					}
					if (i - 1 > -1 && field[i - 1][j] == 'o') {
						if (i - 2 > -1 && field[i - 2][j] == 'w') {
							upX = i;
							upY = j;
							upCows += 1;
						}
					}
				}
			
		}


		System.out.println(rightCows);
		System.out.println(leftCows);
		System.out.println(downCows);
		System.out.println(upCows);
		if (rightCows == 1) {
			returnCows = new int[] { rightY, rightX };
		} else if (leftCows == 1) {
			returnCows = new int[] { leftY, leftX };
		} else if (downCows == 1) {
			returnCows = new int[] { downY, downX };
		} else {
			returnCows = new int[] { upY, upX };
		}

		return returnCows;
	}

}
