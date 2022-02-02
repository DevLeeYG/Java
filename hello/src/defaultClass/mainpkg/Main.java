package defaultClass.mainpkg;
import defaultClass.parentpkg.Parent;
import defaultClass.childpkg.Child;


public class Main {

    public static void main(String[] args){

        Parent p = new Parent(10);
        Child c = new Child(50,60);
        p.show();
        c.show();
    }
    
}
