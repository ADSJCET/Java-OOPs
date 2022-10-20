abstract class Shape
{
	abstract void numberofsides();
}
class Rectangle extends Shape
{
	void numberofsides()
	{
		System.out.println("I am rectangle and I have 4 sides");
	}
}
class Triangle extends Shape
{
	void numberofsides()
	{
		System.out.println("I am Triangle and I have 3 sides");
	}
}
class Hexagon extends Shape
{
	void numberofsides()
	{
		System.out.println("I am Hexagon and I have 6 sides");
	}
}
public class polymorphism
{
	public static void main(String[] args)
	{
		Rectangle ob1 = new Rectangle();
		ob1.numberofsides();
		Triangle ob2 = new Triangle();
		ob2.numberofsides();
		Hexagon ob3 = new Hexagon();
		ob3.numberofsides();
	}
}