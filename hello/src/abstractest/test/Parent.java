package abstractest.test;

public abstract class Parent {
    public void show(){
        System.out.println("parent show()");
    }

    // public void print(){
    //     System.out.println("parent print()");
    // }
    public abstract void print();


}
//추상 메소드가 하나라도 있다면 그 클래스는 반드시 추상 클래스가 되어야 합니다.