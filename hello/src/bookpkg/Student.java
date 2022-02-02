package bookpkg;

public class Student {

    private int age;
    private String name;
    private int grade;

    public Student(){}
    public Student(int age, String name , int grade){

        this.age = age;
        this.name = name;
        this.grade = grade;
    }
    
    public void printStudent(){
        System.out.println("age : " + age + "," + "name: " + name +"," +"grade: "+grade);
    }
}
