package statics;

class Data{
	static int x;
	int y;
	
	
	Data(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	void print() {
		System.out.println("x:" + x);
		System.out.println("y:"+ y); //만약 프린트 메소드가 스태틱이라면 클래스 변수를 쓸수없다. 스태틱에서는 스테틱 멤버만 가능0
	}
	
}

public class Code116 {
	
	public static void main(String[] args) {
		
		Data d = new Data(10,20);
		d.print();
	}

}
