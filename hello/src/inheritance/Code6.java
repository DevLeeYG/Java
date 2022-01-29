package inheritance;

// class Par{
//      private int data = 10;

//      int getData(){
//          return data;
//      }
// }


// class Child extends Par{
//     int data= 20;
//     void printData(){
//         System.out.println("data from Parent : " + super.getData());
//         System.out.println("data from Child; " + this.data); // 자기 클래스의 디스를 바라본다
//         System.out.println("data from Child; " + data);

//     }
// }


// public class Code6{
//     public static void main(String[] args){
//         Child c = new Child();
//         c.printData();
//     }
// }


// class Parent{
//     private int data = 10;
//     int getData(){
//         return data;
//     }

// }

// class Child extends Parent{
//     int data = 20;

//     void printData(){
//         System.out.println("data from Parent :" + super.getData());
//         System.out.println("data form Child :" + this.data);
//         System.out.println("data from Child :" + data);

//     }
// }

// public class Code6{
//     public static void main(String[] args){
//         Child c = new Child();
//         c.printData();
//     }
// }

//부모 클래스의 메소드에 접근하기
//부모 클래스의 메소드는 자식 클래스에서 얼마든지 사용할수 있다.
//그런데 만약에 같은 이름의 메소드가 부모 클래스와 자식 클래스에 모드 있다면 super키워드를 이용하여 부모 클래스의 멤버를 자기 것처럼 사용할 수 있다. 


// class Parent{
//     void printParent(){
//         System.out.println("i am parent print");

//     }
// }

// class Child extends Parent{
//     void printChild(){
//         System.out.println("i am child print");
//     }
// }

// public class Code6{
//     public static void main(String[] args){
//         Child c = new Child();
//         c.printParent();
//         c.printChild();
//     }
// }

// 부모 클래스와 자식 클래스에 같은 이름의 메소드가 있는 경우는 어떻게 될까?

class Parent{
    void print(){
        System.out.println("I am parent prints");
    }
}

class Child extends Parent{
    // void print(){
    //     super.print();
    // }
}

public class Code6{
    public static void main(String[] args){
        Child c = new Child();
        c.print();
    }
}

//