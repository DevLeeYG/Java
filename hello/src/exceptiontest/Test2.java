package exceptiontest;

// package exceptiontest;

// public class Test1 {
//     public static void main(String[] args){
//         int a =5 ;
//         int b = 0;
//         int c;

//         c = a/b;
//         System.out.println("c: " + c);
//     }
    
// }
//수학에서 0으로 나눌수 없듯이 프로그램에서도 0으로 나누는 것은 불가능하며, 위의 코드에서 b값이
//0이 아니라면 문제 없이 수행될것이다. 즉 코드가 항상 예외를 발생시키는 것이 아니고 데이터에 따라 예외가 발생하기도 하고 아니기도한다.
//이렇게 예외가 발생할 가능성이 있을 때 예외 처리를 통해 코드를 안전하게 만들어주어야한다

public class Test2 {
    public static void main(String[] args){
        int n[] = {1,3,5,6,10};
        for(int i = 0 ; i<=5 ; i++){
            System.out.println("n["+ i  +")] = "+ n[i]);
        }
    }
    
}

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//at src/exceptiontest.Test2.main(Test2.java:7)

//<= 5 를 <5 라고 했으면 됬을것이다