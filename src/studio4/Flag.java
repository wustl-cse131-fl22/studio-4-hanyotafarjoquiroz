package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setPenColor(Color.RED);	
		StdDraw.filledRectangle(0.5,0.5, .5, .25);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(0.5, 0.5, .3);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.5, 0.5, .15);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.5, 0.5, .07);
		
		
	}
}