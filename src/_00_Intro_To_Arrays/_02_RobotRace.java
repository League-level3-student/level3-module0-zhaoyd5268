package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
public static void main(String[] args) {
	

	// 2. create an array of 5 robots.
	Robot[] robot = new Robot[5];

	// 3. use a for loop to initialize the robots.
	for (int i = 0; i < robot.length; i++) {
		robot[i] = new Robot();
		robot[i].setSpeed(10);
		robot[i].setY(550);
		if(i == 0) {
			robot[i].setX(100);
		}
		if(i == 1) {
			robot[i].setX(250);
		}
		if(i == 2) {
			robot[i].setX(400);
		}
		if(i == 3) {
			robot[i].setX(550);
		}
		if(i == 4) {
			robot[i].setX(700);
		}
	}

	// 4. make each robot start at the bottom of the screen, side by side, facing up
	
	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.
	boolean hasended = false;
while (hasended == false) {
	for( int i = 0; i < 5; i++) {
		Random random = new Random();
		robot[i].move(random.nextInt(50));
		if (robot[i].getY() <= 0) {
			hasended = true;
			JOptionPane.showMessageDialog(null, "Robot number " + i + " has won! YAY! Also, this is a party for that robot.");
			break;
		}
	}
}
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
}
