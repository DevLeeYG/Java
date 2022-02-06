//test1과 2의 경우처럼 예외가 발생한다면 어떻게 예외 처리를 해야할까
//예외 처리는 try ~catch ~ finally를 이용하여 예외 처리를 할수 있다.


package exceptiontest;

public class Test3 {
    public static void main(String[] args){
    int a = 5;
    int b= 0;
    int c;

    try {
        c=a/b;//에러가 발생할수 있는 코드;
        System.out.println("c : " + c);
    } catch (Exception e) {
        System.out.println("0으로 나눌수 없다");
    }
}

}
