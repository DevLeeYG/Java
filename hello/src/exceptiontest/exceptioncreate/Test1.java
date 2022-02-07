package exceptiontest.exceptioncreate;

class MyException extends Exception{
    int x;
    MyException(int x){
        this.x = x;
    }
    public String toString(){
        return " I am " + x + "in MyException class";
    }
}


public class Test1 {

    public static void main(String[] args){
        MyException me = new MyException(10);
        try{
            System.out.println("before thow MyException");
            throw me; //예외 발생
        }catch(MyException e){
            System.out.println(e);
        }
        System.out.println("main ends");
    }
    
}

