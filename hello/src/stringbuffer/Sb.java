package stringbuffer;

public class Sb {
    
    public static void main(String[] args){
        String s = new String("compuer");
        String new_s = s.substring(0,5) +'t'+ s.substring(5);
        System.out.println("new_s: " + new_s);


        StringBuffer sb = new StringBuffer("compuer");
        sb.insert(5,'t');
        System.out.println("sb:" + sb);
    }
}
