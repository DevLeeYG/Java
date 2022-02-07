package filesavetest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {
    
    public static void main(String[] args){
        FileInputStream fis = null;
        byte b[] = new byte[50];
        try{
           fis = new FileInputStream("/Users/iyeong-gwang/Desktop/Java/hello/src/filesavetest/filesavetests.txt");
            
             fis.read(b);
             for(byte x : b)
             System.out.print((char)x);
            //  System.out.println()으로 할시에는 한글자식 엔터가 들어간다
            }
            catch(FileNotFoundException e){
                System.out.println("filesavetest는 없는 파일입니다");
            }catch(IOException e){
                System.out.println(e);
            }
            finally{
                try{
                    fis.close();
                }
                catch(IOException e){
                    System.out.println(e);
                }
                catch(NullPointerException e){
                    System.out.println("fis가 null 값을 갖고 있습니다");
                }
            }
        }
    }
