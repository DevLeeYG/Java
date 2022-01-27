package helloworld;


class PersonInfo{
	String name; //인스턴스 변수                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	int age;
	double height;
	
	PersonInfo(){

	}
	
	PersonInfo(String n, int a, double h){
		name = n;
		age = a;
		height = h;
		
	}
	
	void printAll() {
		System.out.println("name:" + name);
		System.out.println("age:"+age);
		System.out.println("height:"+height);
	}
}


public class Code105 {
public static void main(String[] args) {
	
	PersonInfo p1 = new PersonInfo(); // p1 인스턴
	PersonInfo p2 = new PersonInfo("alice", 10, 115.5); // p2 인스턴
	p1.printAll();
	p2.printAll();
	
}
}
