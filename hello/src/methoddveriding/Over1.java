package methoddveriding;
// {/**
// 메소드 오버라이딩은 같은 클래스에서 이름은 같고 매개변수가 다른 메소드들 간의 관계이다.
// 상속 관계에서는 메소드 오버라이딩이 있는데. 메소드 오버라이딩은 상속 관계에서 부모 클래스가 갖고 있는 메소드와 똑같은 형태의 메소드를 갖는 것을 말해요. 똑같은
// 형태는 같은 반환값 유형, 같은 메소드명, 같은 매개변수를 말한다.
// */}

// //overloading 은 한클래스 내에서 메소드명은 같고 매개변수가 다른것

// //overriding은 자식 클래스에서 부모 클래스에 있는 메소드와 같은 형태를 말합니다.\\

class Parent {
   void print(){
       System.out.println("i am parent print");
   }
   void test(int x){
       System.out.println("Parent - test method");

   }
}


class Child extends Parent{
    void print(){
        super.print();
    }
    void test(int x){
        super.test(x);
    }
}



public class Over1 {
    public static void main(String[] args){
    Parent p = new Parent();
    p.print();
    p.test(10);
    Child c = new Child();
    c.print();
    c.test(20);
    }
}
