package javainputouput.system;

import java.io.IOException;

public class Test1 {

    public static void main(String[] args){
        System.out.print("Enter one character: ");//print()는 입력받을떄
        int x;
        try{
            x = System.in.read();
            System.out.println("You entered " + x);
            System.out.println("You entered " + ((char)x));//read() 메소드 반환값을 int이며 char로 형변환 해야 영문자출력됨
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    
    
}
