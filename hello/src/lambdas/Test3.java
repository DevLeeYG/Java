package lambdas;

interface MyValue3{
    double getValue(int n);
}

public class Test3 {

    public static void main(String[] args){
        MyValue3 testThree;
        testThree  = (n) ->1.0/n;

        System.out.println(testThree.getValue(5));
    }
    
}
