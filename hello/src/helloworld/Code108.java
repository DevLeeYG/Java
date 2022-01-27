package helloworld;

class Studenta{
	static int numberOfStudent;
	String name;
	double score;
	
	Studenta(){
		numberOfStudent++;
	}
	
	Studenta(String n, double s){
		numberOfStudent++;
		name = n;
		score = s;
	}
	
	void print() {
		System.out.println("name: " + name);
		System.out.println("score: " + score);
		System.out.println("numberOfStudent: " + numberOfStudent);
	}
	
}


public class Code108 {
	public static void main(String[] args) {
		Studenta s1 = new Studenta("Alice", 90.5);
		Studenta s2 = new Studenta("David",88.3);
		Studenta s3 = new Studenta("Cindy",77.1);
		
		s1.print();
		s2.print();
		s3.print();
	}
}
//한번호출할때마다 콘스트러트의 넘버가 올라간다.