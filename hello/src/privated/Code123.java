package privated;

public class Code123 {
	
	static void change(Point t) {
		t.setX(10);
		t.setY(33);
	}
	 public static void main(String[] args) {
		 Point p = new Point(2,7);
		 System.out.println("before:("+p.getX() + "," + p.getY()+")");
		 change(p); 
		 System.out.println("after:("+p.getX() + "," + p.getY()+")");
	 }
	
	

}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
//같은 패키지않에서 불러올수 있엇