package privated;



class Score{
	private int math;
	private int english;
	
	Score(){}
	
	Score(int math, int english){
		this.math = math;
		this.english = english;
	}
	
	int getMath() {
		return math;
	}
	
	int getEnglish() {
		return english;
	}
	
	void setMath(int math) {
		this.math = math;
	}
	
	void setEnglish(int english) {
		this.english = english;
	}
	void incMath(int n) { //점수를 더해주
		this.math += n;
	}
	void incEnglish(int n) {
		this.english += n;
	}
	
	
}


class Stud{
	private String name;
	private Score score; // 스코어 인스턴스를 속성으로 같난
	
	Stud(){}
	Stud(String name, Score score){
		this.name = name;//생성자로 들어온네임 스코어를 교체시킨
		this.score = score;
	}
	

	String getName() {return name;} //리턴을 해서 돌려준다 이름과 점수
	Score getScore() { return score;}
	void setName(String name) {this.name=name;}// 변경시킨다 이름 점수
	void setScore(Score score) {this.score = score;}  //스코어 클래스에서 가져온 스코어를 변경시킨
	void incScore(int m , int e) { // 상승 점수를 입력받으면 스코어의 수학과 영어를 각각 상승시키는 함
		score.incMath(m);
		score.incEnglish(e);
	}
	
	void printStudent() { // 각각 조회한 결과값을 콘솔로 알려준
		System.out.println(name + ":math("+score.getMath()+"),english("+score.getEnglish()+")");
	}
}


public class Code126 {
	
	public static void main(String[] args) {
		Stud s1 = new Stud("Alice", new Score(90,80));//s1인스탄스 이름과 스코어 클래스를 이용한 인스턴스를 입력받는
		
		Score a = new Score(88,93); 
		Stud s2 = new Stud("Bob",a);
		
		Stud s3 = new Stud();
		
		Score b = new Score(78,70);
		s3.setName("Paul");
		s3.setScore(b);
		
		s1.incScore(3,5);
		
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		
		
		
	}
	
	

}
