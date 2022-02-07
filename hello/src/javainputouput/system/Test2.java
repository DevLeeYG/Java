package javainputouput.system;

import java.io.IOException;

public class Test2 {

    public static void main(String[] args)
	{
		int x;
		try {
			while ((x = System.in.read( )) != -1) {
				System.out.print((char)x);
			}
		}
		catch(IOException e) {
			e.printStackTrace( );
		}
	}
    
}
