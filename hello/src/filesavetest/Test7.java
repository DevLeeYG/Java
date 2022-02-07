package filesavetest;
import java.io.FileReader;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args){
        FileReader fis = null;
        try{
            fis = new FileReader("/Users/iyeong-gwang/Desktop/Java/hello/src/filesavetest/filesavetests.txt");
            int x;
            while((x = fis.read()) != -1){
                System.out.print((char)x);
            }
    }catch(IOException e){
        System.out.println(e);
    }
    finally{
        try {
            fis.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
}
//파일데이터를 읽은 클래스를 썻다면 파이널리에 클로즈를 해주자