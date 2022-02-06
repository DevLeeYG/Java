package exceptiontest;

public class Test4 {

    public static void main(String[] args){
        int n[] = {1,3,5,6,10};
        int i  = 0;

        try {
            for(i=0;i<=5;i++){
                System.out.println("n["+ i  +")] = "+ n[i]);
            }
        } catch (Exception e) {
         System.out.println(i + "는 없는 인덱스"); // 예외처리될것은 이쪽으로 빠짐
        }

    }
    
}
