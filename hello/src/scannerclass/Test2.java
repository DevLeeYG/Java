package scannerclass;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Student{
    private int no;
    private String name;
    private int score;

    Student(){}
    Student(int no, String name, int score){
        this.no = no;
        this.name = name;
        this.score = score;
    }

    int getNo(){return no;}
    String getName(){return name;}
    int getScore(){return score;}
    
    public String toString(){
        return no + " :" + name +"(" + score + ")";
    }



}


public class Test2 {
 public static void main(String[] args){
     Student ST[] = new Student[10];
     File file = new File("hello/src/scannerclass/student.txt");
     Scanner scin = null;
     int i = 0;

     try{
         scin = new Scanner(file);
         while(scin.hasNext()){
             int no = scin.nextInt();
             String name = scin.next();
             int score = scin.nextInt();
             ST[i++] = new Student(no,name,score);

         }
     }catch(IOException e){
        System.out.println("student.txt not exist!!");
     }
     System.out.println("== Student List ==");
     System.out.println("------------------");
     for(Student s : ST){
         System.out.println(s);
       
     }
     scin.close();
 }
    
}
/**
 * toString 메소드는 자바에서 특별히 취급하는 메소드이다. toString을 직접 호출하지 않아도 어떤 객체를 System.out.print로 호출
 * 을 한다면 toString()이 호출되도록 약속되어있다.
 * - 생코 -
 */