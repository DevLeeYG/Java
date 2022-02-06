package exceptiontest;

public class Test8 {
 
    public static void main(String[] args){
        try{
            A[7] = 100;
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

}
