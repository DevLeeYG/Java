package abstractest.test;

public class Main {
    public static void main(String[] args){
        
        Parent x = new Child1();
        Parent y = new Child2();

        x.show();
        y.show();
        x.print();
        y.print();

    }

}

//현재 프린트메소드는 자식에서 쓰기때문에 부모에서는 가질 필요가 없다.