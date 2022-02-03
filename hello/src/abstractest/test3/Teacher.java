package abstractest.test3;

public class Teacher extends Person {

    private String subject;

    Teacher(){}
    Teacher(int num, String name, String subject){
        super(num,name);
        this.subject = subject ;
    }

    void show(){
        System.out.println("Teacther infomation");
        System.out.println("===================");
        System.out.println("number : "  + getNum());
        System.out.println("name : " + getName());//
        System.out.println("subject : " + this.subject);

    }
}

