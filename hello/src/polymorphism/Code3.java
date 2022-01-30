package polymorphism;


class Car{
    private String color;
    Car(){}
    Car(String color){this.color=color;}
    void drive(){System.out.println("driving...");}
}

class Sedan extends Car{
    private int seats;
    Sedan(){}
    Sedan(String color, int seats){
        super(color);
        this.seats = seats;
    }
    void showSeats(){
        System.out.println("This car has" + seats +"seats.");
    }
}

class Truck extends Car{
    private int wheel;
    Truck(){}
    Truck(String color, int wheel){
        super(color);
        this.wheel = wheel;
    }
    void showWheel(){
        System.out.println("this truck is" + wheel +"drive truck");
    }
}


public class Code3 {
    public static void main(String[] args){
        Car myCar = new Sedan("white", 4);
        Car yourCar = new Truck("blue",4);

       if(myCar instanceof Sedan){
       myCar.drive(); //클래스 형변환 세단으로 변경 쇼싯트는 카클래스에 없기때문에
       }
       if(yourCar instanceof Truck){
           ((Truck)yourCar).showWheel();
       }

    }
}
