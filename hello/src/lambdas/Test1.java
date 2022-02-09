package lambdas;


interface MyValue1{
    int getValue();
}

public class Test1 {

    public static void main(String[] args){
        MyValue1 mv1; 
        mv1 = () -> 100;
        System.out.println(mv1.getValue());
    }
    
}
