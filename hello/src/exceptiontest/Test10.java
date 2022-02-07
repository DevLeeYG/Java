package exceptiontest;
//test9 예외처리
//makeArray() 메소드에서 예외가 발생하는데 예외처리를 하지 않았습니다.
//대신 throws 구문을 이용해 makeArray() 메소드를 호출하는 메소드에게 예외처리를 해보자
public class Test10 {

    public static void makeArray()throws ArrayIndexOutOfBoundsException{
        int A[] = new int[3];
      
            A[0] = 10;
            A[1] = 20;
            A[2] = 30;
            A[3] = 40;
            A[4] = 50;
        
    
      
    }
    public static void main(String[] args){
            System.out.println("main starts");
            try{
                makeArray();
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception message :" + e.getMessage());
            }
            System.out.println("main ends");
    }
    
}
