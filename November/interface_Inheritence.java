abstract class Animals {
	abstract void EAT();
}

interface Pet {
	void NAME();
}

class Spider extends Animals {
	void EAT() {
		System.out.println("I eats Insects");
	}
	void WALK() {
		System.out.println("I have 8 legs");
	}
}

class Fish extends Animals implements Pet {
	public void NAME() {
		System.out.println("Im Mimi");
	}
	void EAT() {
		System.out.println("I eats Plants");
	}
	void WALK() {
		System.out.println("I can't walk, I swim");
	}
}

class Cat extends Animals implements Pet {
	public void NAME() {
		System.out.println("Im Poppy");
	}
	void EAT() {
		System.out.println("I eats Fish");
	}
	void WALK() {
		System.out.println("I have 4 legs");
	}
}

public class interface_Inheritence {
	
	public static void main(String[] args)
	{
		System.out.println("FISH");
		Fish myFish = new Fish();
		myFish.NAME();
		myFish.EAT();
		myFish.WALK();
		
		System.out.println("\nCAT");
		Cat myCat = new Cat();
		myCat.NAME();
		myCat.EAT();
		myCat.WALK();
		
		System.out.println("\nSPIDER");
		Spider aSpider = new Spider();
		aSpider.EAT();
		aSpider.WALK();
	}
}
