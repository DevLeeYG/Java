package helloworld;


class Friend {
	
	String name;
	int age;
	
Friend(String n, int a){
	name = n;
	age = a;
}

void printFriend() {
	System.out.println("name: " + name + " , age:"+age);
}
	
}

public class Code97{
	public static void main(String[] args) {
		Friend f = new Friend("alice",20);//생성자에 인자 입
		f.printFriend();
	}
}