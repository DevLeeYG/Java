package lambdas;

interface TestT<T>{
    boolean test(T n, T m);
}

public class Test7 {
    public static void main(String[] args){
        TestT<Integer> x = (s,d) -> s<d;

        if(x.test(3,5)){
            System.out.println("3 은 5보다 작다");
        }else{
            System.out.println("1231321");
        }

        TestT<String> z = (a,b) -> a.equals(b);

        String str = "Java";
        if(z.test(str,"Java")){
            System.out.println("same string");
        }else{
            System.out.println("different string");
        }
      
    }
}
