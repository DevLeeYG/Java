package treeset;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

class Persson extends Personf{

   

    
	
 

    public Persson(int id, int score){
       super(id,score);
    }

    int getId() {
     
        return id;
    }
    
  
}

class PersonComparator implements Comparator<Persson>{


@Override
public int compare(Persson o1, Persson o2) {
   
    return o1.getId() - o2.getId();
}
    
}



public class Comparatorif {

    public static void main(String[] args){
        TreeSet<Persson> ts = new TreeSet<>(new PersonComparator());

        ts.add(new Persson(3,83));
        ts.add(new Persson(5,90));
        ts.add(new Persson(1,93));
        ts.add(new Persson(2,88));
        ts.add(new Persson(4,70));

     for(Persson p :ts){
         System.out.println(p);
     }


     
	
    }
   
}
