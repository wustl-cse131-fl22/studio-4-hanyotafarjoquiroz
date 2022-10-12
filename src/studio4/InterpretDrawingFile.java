package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		//colors are 3 ints
		//shapes are 3 doubles
		
		
//		//Ellipses
		String shape = in.next();
		
		if (shape.equals("ellipse")) {
			StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
			if (in.nextBoolean() == true) {
				StdDraw.filledEllipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			} else {
				StdDraw.ellipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
		}
		
		if (shape.equals("triangle")) {
		StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());

		if (in.nextBoolean() == false) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			StdDraw.line(x1, y1, x2, y2);
			StdDraw.line(x2, y2, x3, y3);
			StdDraw.line(x3, y3, x1, y1);
			
		} else {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double [] x = {x1, x2, x3};
			double [] y = {y1, y2, y3};
			StdDraw.filledPolygon(x, y);
		}
	}
		
		
		
		//triangles
//		if (in.next().equals("triangle")) {
//			StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
//
//			if (in.nextBoolean() == false) {
//				double x1 = in.nextDouble();
//				double y1 = in.nextDouble();
//				double x2 = in.nextDouble();
//				double y2 = in.nextDouble();
//				double x3 = in.nextDouble();
//				double y3 = in.nextDouble();
//				StdDraw.line(x1, y1, x2, y2);
//				StdDraw.line(x2, y2, x3, y3);
//				StdDraw.line(x3, y3, x1, y1);
//				
//			}
//		}
		
//		System.out.println(in.next());
//		//Sets pen color
//		StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
//		System.out.println(in.nextBoolean());
//		//Draw Circle
//		StdDraw.filledRectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
		
	}
}
