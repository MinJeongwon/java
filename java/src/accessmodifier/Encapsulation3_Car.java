package accessmodifier;

class Car3{
	private String color;
	private int door;
	
	public String getColor() {
		return color;
	}
	public int getDoor() {
		return door;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
	public void run3() {
		System.out.println("This is a " + color + " car with " + door + " doors.");
	}	
}

public class Encapsulation3_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 c1 = new Car3();
		c1.setColor("black");
		c1.setDoor(2);
		c1.run3();
		
		Car3 c2 = new Car3();
		c2.setColor("white");
		c2.setDoor(4);
		c2.run3();		
	}
}
