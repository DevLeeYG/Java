package hashsett;
import java.util.HashSet;

public class Test1 {

    public static void main(String[] args){

        Integer[] a ={2,3,1,4,4,1,1,2,2,2,3,1,4,4,1};
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0 ; i<a.length ; i++){
            set.add(a[i]); //HashSet set에 배열 a의 원소 저장
        }
        System.out.println(set); //HashSet에 저장된 요소 출력
    }
    
}
//오.. 중복걸러주고 오름차순 정렬 되엇다.