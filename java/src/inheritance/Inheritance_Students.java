package inheritance;

class People{
	public String name;

	public People(String name) {
		this.name = name;
	}	
}

class Students extends People{
	public int id;
	public String department;
	
	public Students(String name, int id, String department) {
		// TODO Auto-generated constructor stub
		super(name);
		this.id=id;
		this.department=department;
	}
}

public class Inheritance_Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st1=new Students("Julie", 2018020143, "Chinese Linguistics");
		Students st2=new Students("David", 2008130145, "Physics");
		
		System.out.println("< Students >");
		System.out.println("Name : " + st1.name + " \t ID number : " + st1.id + " \t Department : " + st1.department);
		System.out.println("Name : " + st2.name + " \t ID number : " + st2.id + " \t Department : " + st2.department);
	}

}
