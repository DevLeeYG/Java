package inheritance;

class Parent{
//	Parent(){
//		System.out.println("parent constructor is called");//생성자에서 프린틀린 함수를 실행해서 자동으로 실행 그리고 항상 부모부터 실행이 먼저된
//	}
	//만약 부모의 생성자가 없더라도 디폴트가 제공되기때문에 괜찮
//	void printParent() {
//		System.out.println("I am parent");
//	}
	Parent(){};
	
	private int dataA;
	Parent(int dataA){
		this.dataA = dataA;
	}
}

class Child extends Parent {
	
//  private int data;
	
	Child(){
//		this.data = data;
		System.out.println("child constructor is called");
		
	}
	void printChild() {
		System.out.println("i am child");
	}
}


public class Code3 {
	
	public static void main(String[] args) {
		Child c = new Child();
//		c.printParent();
		c.printChild();
	}
	
}
