package interfacedefault;


interface WithDefault{
    int COUNT = 100;
    abstract void test();
    default void show(){
        System.out.println("I am show");
    }
}

class Test implements WithDefault{
    public void test(){
       System.out.println("i am test");
    }
}

public class Code1 {
    public static void main(String[] args){
        Test t = new Test();
        t.test();
        t.show();
    }
    
}
