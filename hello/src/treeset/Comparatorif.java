package treeset;
import java.util.Comparator;
import java.util.TreeSet;

class Persson extends Personf{

   

    
	
    public Persson(){
        super();
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

        ts.add(new Personf(5,10));

        System.out.println(ts);


     
	
    }
   
}
