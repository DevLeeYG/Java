package lambdas;

interface MyValue2{
    double getValue();
}

public class Test2 {

    public static void main(String[] args){

        MyValue2 testTwo;

        testTwo =()->100.5;
        System.out.println(testTwo.getValue());
    }
    
}
