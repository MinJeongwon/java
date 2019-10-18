package inheritance;

//parent class
class Animals{
	public String name;
	public String child;

	
	public Animals(String name, String child) {
		System.out.println("A " + name + child + ".");
	}
}

//child class 1
class Birds extends Animals{
	int legs;
	
	public Birds(String name, String child, int legs) {
		// TODO Auto-generated constructor stub
		super(name, child);
		this.name=name;
		this.child=child;
		System.out.print("A " + this.name + " is a bird. It has " + legs + " legs. ");
	}

	public void fly() {
		System.out.println("A " + this.name + " can fly.");
	}
}

//child class 2
class Mammals extends Animals{

	public Mammals(String name, String child) {
		// TODO Auto-generated constructor stub
		super(name, child);
		this.name=name;
		this.child=child;
		System.out.print("A " + this.name + " is a mammal. ");
	}

	public void move() {
		System.out.println("A " + this.name + " moves on four legs.");
	}
}


public class Inheritance_Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b1=new Birds("parrot", " lays eggs", 2);
		b1.fly();
		System.out.println();
		
		Mammals m1=new Mammals("bear", " gives birth to live babies");
		m1.move();
		}
}
