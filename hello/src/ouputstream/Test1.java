package ouputstream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args){
        String content = "Hello java Programmers";
        byte[] bytes = content.getBytes();
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("data321.text",true);
            fos.write(bytes);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                fos.close();
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
    
}
