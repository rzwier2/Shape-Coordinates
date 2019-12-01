/*
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * Object-Oriented Programming: Project 2
 * @date 09/27/2019
 * @author Ryan Zwier
 * 
 * Concrete subclass
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
*/

class Square extends Shape {
	
	double side;
	
	public Square(Point topLeft, double s)
	{
		side = s;
		z = new Point(topLeft.getX() + (0.5 * side), topLeft.getY() - (0.5 * side));
	}
	public Point getCenter() 
	{
		return z;
	}
	
	public String toString()
	{
		return "Square center: " + z + " with side length = " + side;
	}
}
