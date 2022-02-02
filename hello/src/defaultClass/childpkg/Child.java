package defaultClass.childpkg;
import defaultClass.parentpkg.Parent;

public class Child extends Parent {

    private int data;

    public Child(int id, int data) {
        super(id);
        //TODO Auto-generated constructor stub
        this.data = data;
    }

    public void show(){
        System.out.println("id : " + getId());//부모로부터 물려받은 겟 ㅑㅇ
        System.out.println("data :" + data);
    
    }
    
}
