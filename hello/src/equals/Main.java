package equals;

class Thing extends Object{
    private String name;
    private int count;
    Thing(){}
    Thing(String name, int count){
        this.name = name;
        this.count = count;
    }

    void print(){
        System.out.println("name : " + name);
        System.out.println("count: " + count);
    }

    public boolean equals(Object obj){
        if(this.name.equals(((Thing)obj).name) && this.count ==((Thing)obj).count){
            return true;
        }else{
        return false;
        }
    }

}

public class Main {
    public static void main(String[] args){
        Thing th1 = new Thing("desk", 5);
        Thing th2 = new Thing("desk",5);

        if(th1.equals(th2)){
            System.out.println("Same thing");
        }else{
            System.out.println("Diff");
        }
    }
}

// 그냥 == 연산자만 사용했을때는 객체의 참조값만 비교하기때문에 당연이 값이 같이 나오더라도 펄스가 형성이되는데
//equals메소드를 오버라이딩해서 두 인스턴스가 독립되어 있다고해도 변수의 값이 같다면 true로 변환하도록 한다