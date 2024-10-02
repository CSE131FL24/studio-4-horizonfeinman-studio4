package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setCanvasSize(800, 500);
		StdDraw.setPenColor(242, 239, 41);
		StdDraw.setPenRadius(1);
		StdDraw.line(0, 0.5, 1, 0.5);
		
		StdDraw.setPenColor(50, 242, 12);
		StdDraw.filledCircle(0.5, 0.5, 0.25);
		
		StdDraw.setPenColor(145, 41, 242);
		StdDraw.setPenRadius(0.05);
		StdDraw.line(0, 0, 1, 1);
		StdDraw.line(0, 1, 1, 0);
		
		StdDraw.setPenColor(227, 34, 185);
		StdDraw.filledCircle(0.2, 0.8, 0.04);
		
		StdDraw.setPenColor(227, 34, 185);
		StdDraw.filledCircle(0.7, 0.1, 0.04);
		
		StdDraw.setPenColor(227, 34, 185);
		StdDraw.filledCircle(0.8, 0.9, 0.04);
		
		StdDraw.setPenColor(212, 23, 23);
		StdDraw.filledCircle(0.5, 0.6, 0.04);
		
		StdDraw.setPenColor(212, 23, 23);
		StdDraw.filledCircle(0.9, 0.6, 0.04);
		
		StdDraw.setPenColor(212, 23, 23);
		StdDraw.filledCircle(0.2, 0.1, 0.04);
		
		
		
	}
}