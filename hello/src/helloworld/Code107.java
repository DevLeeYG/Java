package helloworld;

class Dda{
	int value;
	static int count;
	
	void print() {
		System.out.println("value:" + value);
		System.out.println("count:" + count);
		
	}
}

public class Code107{
	
	public static void main(String[] args) {
		Dda d1 = new Dda();
		Dda d2 = new Dda();
		d1.print();
		d2.print();
	}
	
}

//스태틱 키워드는 모든 인스턴스가 공유를 한다 