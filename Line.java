/*
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * Object-Oriented Programming: Project 2
 * @date 09/27/2019
 * @author Ryan Zwier
 * 
 * Concrete subclass
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
*/

class Line extends Shape {
	
	Point a;
	Point midPoint;
	
	public Line (Point from, Point to)
	{
		z = new Point(from.getX(), from.getY());
		a = new Point(to.getX(), to.getY());
		midPoint = new Point(((z.getX() + a.getX())/2), (((z.getY() + a.getY() )/2)));
	}
	public Point getCenter() 
	{
		return midPoint;
	}
	public String toString()
	{
		return "Line: coordinate #1 = " + z + " & coordinate #2 = " + a + " and midpoint = " + midPoint;
	}

}
