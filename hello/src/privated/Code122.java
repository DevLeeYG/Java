package privated;


class Point{
	private int x;//x좌표;
	private int y;//y좌표;
	
	Point(){}
	Point(int x, int y){
		this.x = x;
		this.y =y;
	}
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	void setX(int x) {
		this.x = x ;
	}
	void setY(int y) {
		this.y = y;
	}
}


public class Code122 {
 
	static void add(Point t1, Point t2) {
		Point pt = new Point();
		pt.setX(t1.getX() + t2.getX());
	    pt.setY(t1.getY() + t2.getY());
	    System.out.println("p1+p2:("+pt.getX()+","+pt.getY()+")");
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(1,3);
		Point p2 = new Point(5,8);
		
		System.out.println("p1:("+p1.getX()+","+p1.getY()+")");
		System.out.println("p2:("+p2.getX()+","+p2.getY()+")");
	}
	
	
	
}
