/*
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * Object-Oriented Programming: Project 2
 * @date 09/27/2019
 * @author Ryan Z
 * 
 * This file is a test class implements an array of 
 * Shape and insert into the array, one of each kind 
 * of a Shape subclass
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
*/

import java.util.*;

public class TestShapes {
	
	public static void main(String args[])
	{
		double r = 0.0; // radius
		double x = 0.0; // x-coordinate
		double y = 0.0; // y-coordinate
		double h = 0.0; // height
		double w = 0.0; // width
		double toX = 0.0; // line: second point x-coordinate
		double toY = 0.0; // line: second point y-coordinate
		
		Shape[] shape = new Shape[4];
		shape[0] = new Circle(new Point(x, y), r);
		shape[1] = new Square(new Point(x, y), h);
		shape[2] = new Line(new Point(x, y), new Point(toX,toY));
		shape[3] = new Rectangle(new Point(x, y), w, h);
		
		Scanner in = new Scanner (System.in);
		
		for (int i = 0; i < shape.length; ++i) {
			if (shape[i] instanceof Circle)
			{
				System.out.println("Circle: Enter an x-coordinate for the origin: ");
				x = in.nextDouble();
				System.out.println("Circle: Enter an y-coordinate for the origin: ");
				y = in.nextDouble();
				System.out.println("Circle: Enter the length of the radius: ");
				r = in.nextDouble();
				shape[i] = new Circle(new Point(x, y), r);
			}	
			
			if (shape[i] instanceof Square)
			{
				System.out.println("Square: Enter an x-coordinate for the top left point: ");
				x = in.nextDouble();
				System.out.println("Square: Enter an y-coordinate for the top left point: ");
				y = in.nextDouble();
				System.out.println("Square: Enter the side-length: ");
				h = in.nextDouble();
				shape[i] = new Square(new Point(x, y), h);
			}
			
			if (shape[i] instanceof Line)
			{
				System.out.println("Line: Enter an x-coordinate for the original point: ");
				x = in.nextDouble();
				System.out.println("Line: Enter an y-coordinate for the original point: ");
				y = in.nextDouble();
				System.out.println("Line: Enter an x-coordinate for the second point: ");
				toX = in.nextDouble();
				System.out.println("Line: Enter an y-coordinate for the second point: ");
				toY = in.nextDouble();
				shape[i] = new Line(new Point(x, y), new Point(toX, toY));
			}
			
			if (shape[i] instanceof Rectangle)
			{
				System.out.println("Rectangle: Enter an x-coordinate for the top left point: ");
				x = in.nextDouble();
				System.out.println("Rectangle: Enter an y-coordinate for the top left point: ");
				y = in.nextDouble();
				System.out.println("Rectangle: Enter the width: ");
				w = in.nextDouble();
				System.out.println("Rectangle: Enter the height: ");
				h = in.nextDouble();
				shape[i] = new Rectangle(new Point(x, y), w, h);
			}
		}
			
		for(int j = 0; j < shape.length; ++j) {
			System.out.println(shape[j].toString());
		}
		
		in.close();

	}
}
