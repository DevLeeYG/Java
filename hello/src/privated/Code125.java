package privated;
import java.util.Arrays;

class Student{
	private String name;
	private int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	String getName() {
		return name;
	}
	
	int getScore() {
		return score;
	}
	
	void print() {
		System.out.println(name +"(" + score +")");
	}
	
}



public class Code125 {
	
	public static void main(String[] args) {
		
		Student st[] = {new Student("Alice",88),
		 new Student("Tom" ,98),
		 new Student("Jenny",80),
		 new Student("Betty" , 79),
		 new Student("Daniel",91)};
		
		System.out.println(Arrays.toString(st));
		
	
		
	}

}
