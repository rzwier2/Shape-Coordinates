/*
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * Object-Oriented Programming: Project 2
 * @date 09/27/2019
 * @author Ryan Zwier
 * 
 * Concrete subclass
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
*/

class Rectangle extends Shape {
	
	double width;
	double height;
	
	public Rectangle(Point topLeft, double w, double h)
	{
		width = w;
		height = h;
		z = new Point(topLeft.getX() + (0.5 * width), topLeft.getY() - (0.5 * height));
		
	}
	
	public Point getCenter() 
	{
		return z;
	}
	
	public String toString() 
	{
		return "Rectangle center = " + z + " with height = " + height + " and width = " + width;
	}
}
