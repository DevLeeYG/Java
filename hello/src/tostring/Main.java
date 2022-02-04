
package tostring;

class Thing{
    private String name;
    private int price;
    Thing(String name, int price){
        this.name = name;
        this.price = price;
    }

   public String toString(){
       return "name: "+name+",price : " + price;
   }

}

public class Main {
        public static void main(String[] args){
            Thing t = new Thing("book", 20000);
            String s= t.toString();
            System.out.println(s);
            System.out.println(t);
          
        }
    
}
