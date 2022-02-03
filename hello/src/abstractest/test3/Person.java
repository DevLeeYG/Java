package abstractest.test3;

public abstract class Person {
    
    private int num;
    private String name;

    Person(){}
    Person(int num, String name){
        this.num = num;
        this.name = name;
    }

    int getNum(){
        return num;
    }

    String getName(){
        return name;
    }

    abstract void show(); //추상 메소드



}
