package constructor;

class zoo{
	String name;

	//setters, getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	//no-argument constructor
	//automatically genereted when having only no-argument constructor, thus no need to write
	public zoo() {
		this.name=name;
	}
}

public class NoArgumentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zoo n1 = new zoo();
		n1.setName("tiger");
		System.out.println("The animal is a " + n1.getName() + ".");
		
		zoo n2 = new zoo();
		n2.setName("giraffe");
		System.out.println("The animal is a " + n2.getName() + ".");
	}

}
