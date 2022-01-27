package statics;


class Block{
	Block(){
		System.out.println("i am contructor Block()");
	}
	static {
		System.out.println("I am static block");
		
	}
}


public class Code117 {

	public static void main(String[] args) {
	
		Block b1 = new Block();
		
		
	}
	
}
