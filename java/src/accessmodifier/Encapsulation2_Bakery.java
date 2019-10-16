package accessmodifier;

class Bread2{
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
	
	public void purchase() {//메소드 정의문
		System.out.println("A " + type + " costs $" + price + " each.");
	}	
}

public class Encapsulation2_Bakery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread2 b1 = new Bread2(); 
		b1.setType("muffin");
		b1.setPrice(1);
		b1.purchase();
		
		Bread2 b2 = new Bread2(); 
		b2.setType("croissant");
		b2.setPrice(2);
		b2.purchase();
	}
}
