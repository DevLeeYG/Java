package filesavetest;
import java.io.FileReader;
import java.io.IOException;
public class Test8 {
    
    public static void main(String[] args){
        FileReader fis = null;
        char data[] = new char[25];

        try{
            fis = new FileReader("/Users/iyeong-gwang/Desktop/Java/hello/src/filesavetest/filesavetests.txt");
            fis.read(data);
            for(int x : data)
            System.out.print((char)x);
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
