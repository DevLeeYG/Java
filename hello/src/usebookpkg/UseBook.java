package usebookpkg;

import bookpkg.Book; // book 클래스를 임포트 시킵니다,반드시 패키지 구문 아래 와야합니다. 임포트는 여러개 적어도된다.
import bookpkg.Student;
public class UseBook {
    
    public static void main(String[] args){
        Book bk = new Book(101,"algorithms",25000);//에러 발생함;
        bk.printBookinfo();
        Student st = new Student(18,"alice",2);
        st.printStudent();
    } 
    
}
