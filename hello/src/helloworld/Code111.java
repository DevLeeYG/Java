package helloworld;
import java.util.Arrays;

class Book{

	String title;
	int price;
	

    Book(){}
    Book(String title){
    	this.title = title;
    }
	Book(String title, int price){
		
		this(title);
		this.price = price;
		
	}
	
	
}

public class Code111{
	public static void main(String[] args) {
		Book b = new Book("JAVA",25000);
		Book b1 = new Book("Peter pan", 10000);
		Book b2 = new Book("Aladdin", 9000);
		System.out.println(b.title+","+b.price);
		System.out.println(b1.title +","+b1.price);
		System.out.println(b2.title +","+b2.price);
	}
}


//b1을 생성하면this는 b1 b2는 b2