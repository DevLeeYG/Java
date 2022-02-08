package treeset;
import java.util.Iterator;
import java.util.TreeSet;

class Personf implements Comparable<Personf>{

    protected int id;
    private int score;
    Personf(){}
    Personf(int id, int score){ this.id = id; this.score = score;}
    public String toString(){return "[id=" + id + ", score = "+ score +"]";}

    public int compareTo(Personf p){
		return this.id - p.id;
	}
    
}


public class Comparableif {

    public static void main(String[] args){
        TreeSet<Personf> ts = new TreeSet<>( );
		ts.add(new Personf(3, 83));
		ts.add(new Personf(5, 90));
		ts.add(new Personf(1, 93));
		ts.add(new Personf(2, 88));
		ts.add(new Personf(4, 70));
		Iterator<Personf> itr = ts.iterator( ); // iterator �̿��Ͽ� ����ϱ�
		while (itr.hasNext( ))
			System.out.println(itr.next( ));
	}
    
}
