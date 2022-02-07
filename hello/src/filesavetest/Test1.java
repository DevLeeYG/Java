package filesavetest;
import java.io.FileInputStream;//파일객체로부터 스트림 객체를 생성함
import java.io.IOException;
public class Test1 {

    public static void main(String[] args)
	{
        FileInputStream fis = null;
		try {
         
			fis = new FileInputStream("/Users/iyeong-gwang/Desktop/Java/hello/src/filesavetest/filesavetests.txt");
			System.out.println((char)fis.read( ));
			System.out.println((char)fis.read( ));
			System.out.println((char)fis.read( ));
			System.out.println((char)fis.read( ));
			System.out.println((char)fis.read( ));
			System.out.println((char)fis.read( ));
			System.out.println((char)fis.read( ));
			System.out.println((char)fis.read( ));
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close( );
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("main end");
	}
}
    

