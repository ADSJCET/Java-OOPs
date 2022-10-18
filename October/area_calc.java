import java.util.Scanner;
class Area
{
	void area(int r)
	{
		float area;
		area=(float) (r*r*3.14);
		System.out.println("Area of circle is:  "+area);
		System.out.println("\n");
	}
	void area(double l,double b)
	{
		double area;
		area=l*b;
		System.out.println("Area of rectangle is:  "+area);
		System.out.println("\n");
	}
	void area(float b,float h)
	{
		float area;
		area=(float) (0.5*b*h);
		System.out.println("Area of triangle is:  "+area);
		System.out.println("\n");
	}
}
public class area_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		double l,b;
		float ba,h;
		Scanner sc= new Scanner(System.in);
		Area ob=new Area();
		System.out.println("Enter radius of circle\n");
		r=sc.nextInt();
		ob.area(r);
		System.out.println("Enter length and breadth of rectangle\n");
		l=sc.nextDouble();
		b=sc.nextDouble();
		ob.area(l,b);
		System.out.println("Enter base and height of triangle\n");
		ba=sc.nextFloat();
		h=sc.nextFloat();
		ob.area(ba, h);
		
	}

}
