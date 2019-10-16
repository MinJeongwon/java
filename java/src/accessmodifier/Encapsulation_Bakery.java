package accessmodifier;

class Bread1{
	private String type;
	private int price;

	public String getType() {
		return type;
	}
	public int getPrice() {
		return price;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

public class Encapsulation_Bakery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread1 b1 = new Bread1();
		b1.setType("muffin");
		b1.setPrice(1);
		System.out.println("A " + b1.getType() + " costs $" + b1.getPrice() + " each.");
	
		Bread1 b2 = new Bread1();
		b2.setType("croissant");
		b2.setPrice(2);
		System.out.println("A " + b2.getType() + " costs $" + b2.getPrice() + " each.");
	}

}
