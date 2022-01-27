package helloworld;


class Gae{
	String name;
	String color;

	
	
	void printDog() {
		System.out.println("name : "+name);
		System.out.println("color : " +color);
	}
}

public class Code99{
	public static void main(String[] args) {
		Gae g = new Gae();
		g.printDog();
		
	}
}
