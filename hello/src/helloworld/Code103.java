package helloworld;


class Data{
	int m;
	Data(int x){
		m = x;
	}
	void printData() {
		System.out.println("m:"+m);
	}
}


public class Code103 {
	
	public static void main(String[] args) {
		Data d= new Data(100);
		d.printData();
	}

}
