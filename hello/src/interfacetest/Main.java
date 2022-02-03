package interfacetest;
import java.util.*;
public class Main {
   
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter number between 0 and 100 :");
        int num = scin.nextInt();
        if(num<Limit.MIN || num > Limit.MAX)
        System.out.println("out of range");
    }
    
}
