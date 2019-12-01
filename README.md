# Shape-Coordinates
This project familiarizes you with designing and implementing class hierarchies using an abstract base class, and gives you experience with inheritance, polymorphism, and other features of Java. 

A class Point is defined with a constructor public Point(double x, double y) and accessor methods getX, getY. A toString method for this class is designed and implemented. 

An abstract class Shape is defined with an instance variable of class Point, a constructor, a concrete method public voidsetOrigin(Point x) that moves the origin of the object, and an abstract method public Point getCenter() is implemented. 

A concrete subclasses Circle, Rectangle, Line, Square is implemented with constructors public Circle(Point center, double radius), public Rectangle(Point topLeft, double width, double height),public Square(Point topLeft, double side)and public Line (Point from, Point to). For each subclass, getCenter and toString() is implemented, which will print all details of the shape plus the coordinates of the geometric figure’s center point.

The tester class is called TestShapes. TestShapes implements an array of Shape and insert into the array, one of each kind of a Shape subclass. A loop to call the toString method of each shape in the array. Then a loop is used to ask the user for the coordinates of a point and set the origin of a shape (center if it is a Circle, topleft for a Rectangle or Square, and from in the case of a Line) in the array to that Point. Finally a loop is used to print out the polymorphic array using the toString method for each Shape.
