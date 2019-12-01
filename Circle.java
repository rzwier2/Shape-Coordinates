/*
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * Object-Oriented Programming: Project 2
 * @date 09/27/2019
 * @author Ryan Zwier
 * 
 * Concrete subclass
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
*/

class Circle extends Shape {
	public double halfDiameter; // Radius
	
	public Circle(Point center, double radius) {
		halfDiameter = radius;
		z = new Point(center.getX(), center.getY());
	}
	
	public Point getCenter() 
	{
		return z;
	}
	
	public String toString()
	{
		return "Circle origin: " + z + " with radius = " + halfDiameter;
	}
	
}
