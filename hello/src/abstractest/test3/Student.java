package abstractest.test3;

public class Student extends Person{

    private int year;
    Student(){}
    Student(int num, String name, int year){

        super(num,name);
        this.year = year;
    }

	void show() {
		System.out.println("Teacher Information");
        System.out.println("------------------");
        System.out.println("number : " + getNum());
        System.out.println("subject:" + this.year);
		
	}
    
}
