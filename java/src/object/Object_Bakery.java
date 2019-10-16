package object;

class Bread{
	public String type;
	public int price;
	public void purchase() {
		System.out.println("A " + type + " costs $" + price + " each.");
	}
}

public class Object_Bakery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread b1 = new Bread();
		b1.type = "muffin";
		b1.price = 1;
		b1.purchase();
		
		Bread b2 = new Bread();
		b2.type = "croissant";
		b2.price = 2;
		b2.purchase();
	}

}
