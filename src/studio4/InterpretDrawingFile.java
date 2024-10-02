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

		String shape = in.next();

		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();

		boolean filled = in.nextBoolean();


		StdDraw.setPenColor(num1, num2, num3);

		if (shape.equals("rectangle")) {

			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			
			if (filled==false) {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
		}

		if (shape.equals("ellipse")) {

			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			
			if (filled==false) {
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}
		}

		if (shape.equals("triangle")) {

			double[] xNums = new double[3];
			double[] yNums = new double[3];
			
			xNums[0] = in.nextDouble();
			yNums[0] = in.nextDouble();
			xNums[1] = in.nextDouble();
			yNums[1] = in.nextDouble();
			xNums[2] = in.nextDouble();
			yNums[2] = in.nextDouble();
			
			if (filled==false) {
				StdDraw.polygon(xNums, yNums);
			}
			else {
				StdDraw.filledPolygon(xNums, yNums);
			}
		}


	}
}
