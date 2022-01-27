package helloworld;
import java.util.Arrays;

class Book{
	String title;
	int price;
	
	
	Book(){};
	Book(String title){
		this.title = title;
	}
	Book(String title, int price){
	    this(title);
		this.price = price;
	
	}
	
}



public class Code111 {

	public static void main(String[] args) {
	   Book b = new Book("Java",25);
	   System.out.println(b.title);
	}
	
	
}
//b1을 생성하면this는 b1 b2는 b2