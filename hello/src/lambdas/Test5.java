package lambdas;

interface Test{
    boolean test(int n , int m);
}

public class Test5 {

    public static void main(String[] args){
        Test t1 = (n,d) ->(n%d) == 0;

        if(t1.test(10,5)){
            System.out.println("5는 10의 인수이다");
        }
        if(!t1.test(10,3)){ //펄스이면 0으로 되지않을때
            System.out.println("3은 10의 인수가 아니다");
        }
        System.out.println();

        Test t2 = (n,m) -> (n<m);
        if(t2.test(3,5)){
            System.out.println("3 is less than5");
        }
        if(!t2.test(5,3)){
            System.out.println("5 is not less than 3");
        }
        System.out.println();
    }
    
}
