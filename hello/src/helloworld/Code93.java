package helloworld;
import java.util.Arrays;
class Car {
	String kind; //차종
	String color; //색상
    int year;// 연식
    
    void run() {
    	System.out.println("car is running"); //메소
    	
    }
    
    void speedUp() {
    	System.out.println("car is speeding up");//메소
    }
    
}



public class Code93 {
	
   public static void main(String[] args) {
	
	   Car myCar = new Car(); //Car 속성을 쓰겟
	   
	   myCar.kind = "Sonata";
	   myCar.color = "white";
	   myCar.year =2015;
	   
	   Car yourCar = new Car();
	   yourCar.kind = "Pride";
	   yourCar.color ="blue";
	   yourCar.year = 2017;
	   
	   myCar.run();//메소드 호출 (함수호출)myCar객체의 런 메소드를 붙여서 호출
	   yourCar.run();
	   
	   myCar.speedUp();
	   yourCar.speedUp();
	   
	  
	   
   }
	

}
