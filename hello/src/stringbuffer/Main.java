package stringbuffer;

public class Main {

    public static void main(String[] args){

        StringBuffer sb1 = new StringBuffer("Hello");

        StringBuffer sb2 = new StringBuffer();

        sb2.append("World"); //빈 StringBuffer 객체에 "world"문자열을 붙임

        StringBuffer sb3 = new StringBuffer(20);

        sb3.append("Java Programming is created by james Gosling");

        System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb1.capacity( ));
		System.out.println(sb2.capacity( ));
		System.out.println(sb3.capacity( ));

    }
    
}
