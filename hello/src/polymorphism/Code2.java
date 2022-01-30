package polymorphism;
//instanceof 연산자
class Data1{
    void print(){
        System.out.println("class Data1 print method");
    }
}

class Data2{
    void show(){
        System.out.println("class data2 show method");
    }
}

public class Code2 {
    public static void main(String[] args){
        Data1 d1 = new Data1();
        Data2 d2 = new Data2();

        if(d1 instanceof Data1){
            d1.print(); // d1의 Data가 1의 인스턴스가 인지 판단한다.
        }
        if(d2 instanceof Data2){
            d2.show();
        }

    }
}
