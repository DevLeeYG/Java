package filesavetest;
import java.io.*;
public class Test3 {
    public static void main(String[] args){
        int i;
         String a = "/Users/iyeong-gwang/Desktop/Java/hello/src/filesavetest/filesavetests2.txt";
        

        try(FileInputStream fin = new FileInputStream(a);){
            do{
                i = fin.read();
                if( i != -1){
                    System.out.print((char)i);
                }
            }
            while(i != -1);
        }catch(IOException e){
            System.out.println("Error");
        }

}
}
