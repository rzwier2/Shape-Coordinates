/*
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * Object-Oriented Programming: Project 2
 * @date 09/27/2019
 * @author Ryan Z
 * 
 * Abstract class with an instance variable of class Point
 * and an abstract method public Point getCenter()
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
*/

public abstract class Shape {
	Point z; //Origin Point
	Point a;
	public Shape() 
	{
		
	}
	
	public void setOrigin(Point o) //Point o is the origin
	{
		this.z = new Point(o.getX(), o.getY());
	}
	
	public abstract Point getCenter();
	
}
