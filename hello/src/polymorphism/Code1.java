package polymorphism;

// class Parent{
//     void print(){
//         System.out.println("parent - print method");
//     }

//     void test(){
//         System.out.println("Parent - test method");
//     }
// }

// class Child extends Parent{
//     void print(){
//         System.out.println("child - print method");
//     }
//     void check(){
//         System.out.println("child - check method");
//     }
// }



class Person{
    private String name;
   
    Person(){}
    Person(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void print(){
        System.out.println("i am " + name);
    }
}

class Teacher extends Person {
    private String subject;
    Teacher(){}
    Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

 void print(){
     System.out.println("I am " + getName() + " and I teach " + subject + ".");
 }

}


class Student extends Person{
    private String year;
   
    Student(){}
    Student(String name, String year){
        super(name);
        this.year = year;
    }

    void print(){
        System.out.println("I am" + getName() + " and I am " + year + ".");
    }
    
}


public class Code1 {

    public static void main(String[] args){
        
        Person p1 = new Teacher("Alice", "Math");
        p1.print();
        Person p2 = new Student("David","Sophomore");// 부모 클래스의 자식인 스투던트 인스턴스로 퍼슨에는 프린트 메소드가 있기때문에 스튜던트의 메소드를 출력한다 없다면 출력이 되지않을것
        p2.print();
        
    }
    
}
