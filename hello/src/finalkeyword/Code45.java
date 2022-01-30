package finalkeyword;
//파이널 클래스는 자식 클래스를 가질 수 없는 클래스입니다. 즉 자신이 마지막 클래스 입니다.

// final class Data{
//     private int x;
//     Data(){}
//     Data(int x){
//         this.x = x;
//     }
// }


// class ChildData extends Data{}//파이널이라 상속받을수 없음
//fianl 인스턴스 변수는 contantic 하다 한마디로 상수이다. 저장된 값은 바꿀수 없다.

//

// class Data{

//     final private int x;
//     Data(){
//     this.x = 0;
//    }

//    Data(int x){
//        this.x = x;
//    }
// }

//또한 셋으로도 변경 시킬수 없다.

//final 인스턴스 변수를 초기화하지 않고 선언하면 반드시 생성자를 통해서 초기화해야한다.



class Circle{
    static final double PI  = 3.141592;
    private double radius;

    Circle(){}
    Circle(double radius){
        this.radius = radius; //상수를 생성자를 활용해서 초기화한다.
    }

    double getRadius(){
        return radius;
    }

    // void setRaadius(double radius){
    //     this.radius = radius;
    // }

}

// public class Code45{
//     public static void main(String[] args){
//         Circle c1 = new Circle(1.5);
//         Circle c2 = new Circle(2.2);

//         double c1Area = Circle.PI * c1.getRadius() * c1.getRadius();
//         double c2Area = Circle.PI * c2.getRadius() * c2.getRadius();

//         System.out.println("c1 area : " + c1Area);
//         System.out.println("c2 area : " + c2Area);
//     }
   

// }

//final 인스턴스 변수는 static으로 정의 해서 모든 인스턴스가 같은 값을 공유하도록 하는것이 좋은 방법



//fianl 메소드는 오버라이딩 할 수 없는 메소드이다. 즉, 자식 클래스에서 오버라이딩 메소드를  가질수 없는 객체


// class Data{
//     private int x;
//     Data(){}
//     Data(int x){
//         this.x  = x;
//     }
//     final void show(){
//         System.out.println("X: " + x); //파이널 메소드는 오버라이딩 할수 없다  자식클래스에서 오버라이딩 메소드를 가질수 없다.
//     }
// }

// class ChildData extends Data{
//     ChildData(){}
//     void show(){
//         System.out.println("i am child show");
//     }
// }


// fianl local var

//메소드 내의 파이널 변수도 final이 붙을수 있으며 변경할수 없는 것이 된다. 