abstract class base_shape{
	abstract void numberOfShapes();
}
class rectangle extends base_shape{
	void numberOfShapes() {
		System.out.println("I am Rectangle, I have 4 sides!");
	}
}
class triangle extends base_shape{
	void numberOfShapes() {
		System.out.println("I am Triangle, I have 3 sides!");
	}
}
class hexagon extends base_shape{
	void numberOfShapes() {
		System.out.println("I am Hexagon, I have 6 sides!");
	}
}

public class shape {
	public static void main(String[] args) {
		
		rectangle myRectangle = new rectangle();
		myRectangle.numberOfShapes();
		
		triangle myTriangle = new triangle();
		myTriangle.numberOfShapes();
		
		hexagon myHexagon = new hexagon();
		myHexagon.numberOfShapes();
		
	}

}
