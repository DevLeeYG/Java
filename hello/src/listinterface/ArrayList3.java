package listinterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class ArrayList3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(50);
        list.add(1,55);
        list.add(3,77);
    
        Iterator<Integer> iter = list.iterator();//iterator(반복자)를 얻는다
        Integer t;
        while(iter.hasNext()){
           t = iter.next();
            System.out.println(t.toString());
           
        }
       
    }
}
