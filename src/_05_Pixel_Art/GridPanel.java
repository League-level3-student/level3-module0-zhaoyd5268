package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GridPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private int windowWidth;
	private int windowHeight;
	private int pixelWidth;
	private int pixelHeight;
	private int rows;
	private int cols;

	// 1. Create a 2D array of pixels. Do not initialize it yet.
	public Pixel[][] array2d;
	private Color color;

	public GridPanel(int w, int h, int r, int c) {
		this.windowWidth = w;
		this.windowHeight = h;
		this.rows = r;
		this.cols = c;

		this.pixelWidth = windowWidth / cols;
		this.pixelHeight = windowHeight / rows;

		color = Color.BLACK;

		setPreferredSize(new Dimension(windowWidth, windowHeight));

		// 2. Initialize the pixel array using the rows and cols variables.
			array2d = new Pixel[rows][cols];
		// 3. Iterate through the array and initialize each element to a new pixel.
			for(int i = 0; i < array2d[rows-1].length; i++) {
				for(int j = 0; j < array2d[cols-1].length; j++) {
					array2d[i][j] = new Pixel(i*pixelWidth, j*pixelHeight);
				}
			}
	}

	public void setColor(Color c) {
		color = c;
	}

	public void clickPixel(int mouseX, int mouseY) {
		// 5. Use the mouseX and mouseY variables to change the color
		// of the pixel that was clicked. *HINT* Use the pixel's dimensions.
		array2d[mouseX/pixelWidth][mouseY/pixelHeight].color = color; 
		
	}

	@Override
	public void paintComponent(Graphics g) {
		// 4. Iterate through the array.
		// For every pixel in the list, fill in a rectangle using the pixel's color.
		// Then, use drawRect to add a grid pattern to your display.
		for(int i = 0; i < array2d[rows-1].length; i++) {
			for(int j = 0; j < array2d[cols-1].length; j++) {
				g.setColor(array2d[i][j].color);
				g.fillRect(array2d[i][j].x, array2d[i][j].y, pixelWidth, pixelHeight);
				g.setColor(color.white);
				g.drawRect(array2d[i][j].x, array2d[i][j].y, pixelWidth, pixelHeight);
			}
		}

	}
}
