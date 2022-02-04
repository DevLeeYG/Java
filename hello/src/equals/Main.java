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
