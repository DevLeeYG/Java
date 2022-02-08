package listinterface;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("C");
        list.add("Java");
        list.add("HTML5");
        list.add(1, "C++");
        list.set(0,"Fortran");
        list.remove(2);
        list.remove("C++");

        for(int i = 0 ; i< list.size() ; i++){
            String s = list.get(i);
            
            System.out.println(s);
             // ["C"]["Java"]["HTML5"]

        }
    }
    
}
