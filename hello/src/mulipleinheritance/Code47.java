package mulipleinheritance;


class Parent{
    int a = 0 ; 
    void show(){
        System.out.println(" i am parent show");

    }
}


class Child1 extends Parent{
    int b = 20 ;
    void show1(){
        System.out.println("I am child show");
    }
}

class Child2 extends Parent{
    int c = 30;
    void show2(){
        System.out.println("i am child2 show");
    }
}

public class Code47 {

    public static void main(String[] args){
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        System.out.println("c1.a : " + c1.a);
        System.out.println("c1.b : " + c1.b);
        System.out.println("c2.a : " + c2.a);
        System.out.println("c2.b : " + c2.c);
        c1.show();
        c1.show();
        c2.show();
        c2.show();

    }
    
}
