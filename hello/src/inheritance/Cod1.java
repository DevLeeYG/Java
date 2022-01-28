package inheritance;
//상속 : 재사을 위해 부모클래스로부터 상속받는다 -> 유
//extends 키워드는 상속할떄 쓰는 키워드
//ex class Student extends Person// 클래스Student는 클래스 Person을 상속받


class Person {
	private String name;//클래스에 정의된 변를 인스턴스 변수라고 한다.
	private String phone;

Person(){}
Person(String name, String phone){
	this.name = name;
	this.phone = phone;
}

void printPerson() {
	System.out.println("name : " + name);
	System.out.println("phone: " + phone);
	}
}


class Student extends Person{
	private int score;
	Student(){}
	Student(String name, String phone, int score){
		super(name,phone);// 부모생성자를 호출하는 키워드 /Person을 불러서 네임과 폰을 스튜던트로받아 
		this.score = score;
		
	}
	void printStudent() {
		printPerson(); //부모클래스의 메소드 사
	}
	
}


public class Cod1 {
	
	public static void main(String[] args) {
		Student s = new Student("Alice","010-111-1111",90);
		s.printStudent();
	}
	

}
