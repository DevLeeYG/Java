package filesavetest;
import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args){
        FileInputStream fis = null;
        String a = "/Users/iyeong-gwang/Desktop/Java/hello/src/filesavetest/filesavetests.txt";
        try{
            fis = new FileInputStream(a);
            int x;
            while((x = fis.read()) != -1){
                System.out.print((char)x);
            }
        }catch(IOException e){
            System.out.println(e);
        }finally{
            try{
                fis.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
        }
    }
    
}

