package filesavetest;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Test2 {
    public static void main(String[] args){
        FileInputStream fis = null;
        String a = "/Users/iyeong-gwang/Desktop/Java/hello/src/filesavetest/filesavetests2.txt";
        try{
            fis = new FileInputStream(a);
            int x;
            while((x = fis.read()) != -1){
                System.out.print((char)x);
            }
          
        }  catch(FileNotFoundException e){
            System.out.println("xxxx.txt는 없는 파일입니다.");
            }
        
        catch(IOException e){
            System.out.println(e);
        }finally{
            try{
                fis.close();
            }
        
            catch(IOException e){
                System.out.println(e);
            }
            catch(NullPointerException e){
                System.out.println("fis 가 null값을 가지고있다");
            }
        }
    }
    
}

