package constructor;

class Cafe{
	String coffee;
	double price;
	
	//parameterized constructor overloading
	public Cafe(String coffee, double price) {
		// TODO Auto-generated constructor stub
		this.coffee=coffee;
		this.price=price;
	}
	//no-argument constructor overloading
	public Cafe() {
		// TODO Auto-generated constructor stub
	}
	//setters, getters
	public String getCoffee() {
		return coffee;
	}
	public double getPrice() {
		return price;
	}
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
			return this.coffee + " \t $" + this.price + "\t size upgrade \t $" + (this.price+0.5);
	}
	
	public void promo() {
		System.out.println("get 30% off on " + this.coffee + "\t discount price $" + Double.parseDouble(String.format("%.1f", this.price*0.7)));
	}
}

public class Constructor_Cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("< menu >");
		
		Cafe o1 = new Cafe("Espresso", 2.0);
		System.out.println(o1);
		
		Cafe o2 = new Cafe("Americano", 2.5);
		System.out.println(o2);
		
		Cafe o3 = new Cafe("Cafe Latte", 3.0);
		System.out.println(o3);
		
		Cafe o4 = new Cafe("Cafe Mocha", 3.5);
		System.out.println(o4);
		System.out.println();
		
		System.out.println("< promotion for this month >");
		o2.promo();
		o4.promo();
		System.out.println();
		
		Cafe o5 = new Cafe();
		o5.setCoffee("Pumpkin Latte");
		System.out.println("** " +o5.getCoffee() + " is only available in winter" + " **");
	}

}
