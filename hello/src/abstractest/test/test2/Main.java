package abstractest.test.test2;

public class Main {
    public static void main(String[] args){
       
        Child x = new Child();
        x.show();//부모까지 올라가서 찾을것이다
        x.print();//자식에 있다.
        x.call();//자식에서 추상메소드를 재 정의해서 사용하고 있다.
        // Parent y = new Parent(5);//에러발생 객체화할수 없음
    }
    
}
