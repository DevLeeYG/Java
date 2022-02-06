package exceptiontest;

public class Test5 {
    public static void main(String[] args){
        try {
            System.out.println("hello world");
            System.out.println("inside try");
        } catch (Exception e) {
           System.out.println("i am catch");
        }
        finally{
            System.out.println("finally bloc");
        }
    }
    
}
//위의 코드는 출력문으로만 구성되어서 예외가 발생할 부분이 업속, 따라서 try
//블록 코드가 모두 수행되고 예외가 발생하지 않았기 때문에catch 블록은 건너띈다
//fianlly는 예외 처리 상관없이 무조건 수행
