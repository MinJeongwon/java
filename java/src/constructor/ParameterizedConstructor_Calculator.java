package constructor;

class calculator{
	
	private int left, right;
	
	//parameterized constructor overloading
	public calculator(int left, int right) {
		// TODO Auto-generated constructor stub
		this.left=left;
		this.right=right;
	}
	
	//setters, getters
	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public void setRight(int right) {
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void sub() {
		System.out.println(this.left - this.right);
	}
	
	public void mul() {
		System.out.println(this.left * this.right);
	}
	
	public void div() {
		System.out.println(this.left / this.right);
	}
		
}

public class ParameterizedConstructor_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			calculator cal = new calculator(392, 50);
			cal.sum();
			cal.sub();
			cal.mul();
			cal.div();
	}

}
