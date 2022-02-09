package lambdas;

interface MyValue4{
    boolean getValue(int n);//no parameter?
}

public class Test4 {

    public static void main(String[] args){
        MyValue4 test4s;

        test4s = (n) ->(n%2) == 0;//지연처리
        System.out.println(test4s.getValue(50));
        System.out.println(test4s.getValue(23));
    }
    
}
