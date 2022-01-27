package helloworld;



class Frien {

	String name;
	int age;
	
	Frien(String name, int age){
		this.name = name;
		this.age = age;
	}
	void hello() {
		System.out.println("Hello");
	}
	void printFrien() {
		this.hello();
		System.out.println("name:" + this.name +", age:"+this.age);
	}
	

	;
}

public class Code113{
	public static void main(String[] args) {
	
	  Frien d = new Frien("asd",3);
	   d.printFrien();
//	  System.out.println(d.name+","+d.age);
	}

	
	
	
}
