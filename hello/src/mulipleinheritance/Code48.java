package mulipleinheritance;

class GrandParent{
    int x = 10 ;
    void show1(){
        System.out.println("i am grandparent show1");
    }
}

class Parent extends GrandParent{
    int y = 20;
    void show2(){
        System.out.println("I am parent show2");
    }
}

class Child extends Parent{
    int z = 30;
    void show3(){
        System.out.println("I am child show");
    }
}


public class Code48 {

    public static void main(String[] args){
        Child t = new Child();
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("t.z: " + t.z);

        t.show1();
        t.show2();
    }
    
}
