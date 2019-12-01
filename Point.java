/*
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * Object-Oriented Programming: Project 2
 * @date 09/27/2019
 * @author Ryan Zwier
 * 
 * class Point, a constructor public Point(double x, double y)
 *  and accessor methods getX, getY
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
 */

public class Point {
	
	private double x;
	private double y;

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX() 
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}

	public String toString() 
	{
		return "(x,y) = (" + x + "," + y + ")"; 
	}

}
