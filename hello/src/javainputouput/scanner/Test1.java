package javainputouput.scanner;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner scin = new Scanner(System.in);//System.in -> 키보드를 말함
        System.out.print("Name : ");
        String name = scin.next(); //string을 읽을떄
        System.out.print("Phone number: ");
        String phone = scin.next();
        System.out.print("Age: ");
        int age = scin.nextInt();//read int
        System.out.print("Height : ");
        float height = scin.nextFloat(); //read float
        System.out.print("Gender : ");
        char gender = scin.next().charAt(0);//string 첫문자
        
        System.out.println("Name : " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Age : " + age);
        System.out.println("height: " + height);
        System.out.println("Gender: " + gender);

        scin.close();
    }
    
}
