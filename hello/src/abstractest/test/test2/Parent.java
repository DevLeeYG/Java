package abstractest.test.test2;

public abstract class Parent {
    private int dataA;

    // Parent(){}
    // Parent(int dataA){
    //     this.dataA = dataA;
    // }

    void show(){
        System.out.println("I am parent show");
    }


   abstract void call();
}
