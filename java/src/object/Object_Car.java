package object;

class Car{
	public String color;
	public int door;
	public void run() {
		System.out.println("This is a " + color + " car with " + door + " doors.");
	}
}

public class Object_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.color = "black";
		c1.door = 2;
		c1.run();
		
		Car c2 = new Car();
		c2.color = "white";
		c2.door = 4;
		c2.run();		
	}
}
