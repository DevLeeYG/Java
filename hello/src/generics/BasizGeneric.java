package generics;

class Data<T>{
    // 클래스명 옆에 제네릭 기호 <> 를 적고 그안에 매개변수 기술

    T obj; //인스턴스 변수 obj의 자료형은 T이다
    Data(T ob){//constructor BasicGeneric 은 자료형이 T인 인수 한개를 입력받는다.

         obj = ob;
    }

    T getObj(){//인스턴스 변수 obj의 자료형은 T임
        return obj;
    }

    void showType(){
        System.out.println("Type of T: " + obj.getClass().getName());
// getClass() :Object클래스안에 정의 리턴값은클래스
// getName() :Class클래스 안에 정의 리턴값은 클래스명
    }

    public int calcMultiple(int i) {
        return 0;
    }
}


public class BasizGeneric<T> { 
    
    public static void main(String[] args){
        Data<Integer> d1 = new Data<Integer>(100);//정수 100인수
        System.out.println(d1.getObj());
        d1.showType();

        Data<String> d2 = new Data<String>("JAVA");//문자열 'JAVA' 인수
        System.out.println(d2.getObj());
        d2.showType();
    }
}


