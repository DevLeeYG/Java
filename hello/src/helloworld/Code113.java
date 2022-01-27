package helloworld;


class Studentss{
	int number;
	String name;
	double score;
	
	
	
Studentss(){}	
Studentss(int number){
	this.number = number;
}
Studentss(int number, String name){
	this(number);
	this.name = name;
}
Studentss(int number, String name, double score){
	this(number,name);//number 와name만 부르른 생성자를 호출을 하고 있는데 첫줄에만 써야된다.
	this.score = score;

}
	
	
}

public class Code113 {
	
	public static void main(String[] args) {
		Student s = new Student(10,"paul",88.5);

}
}
