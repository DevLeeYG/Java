package interfacetest.test3;

interface Things{
    void printInfo();
}

interface Book extends Things{ //인터페이스 book은 인터페이스 things를 상속받습니다
    void showTitle();
}

class ChildrenBook implements Book{ //클래스 childrenBook은 인터페이스 Book을 상속받습니다
    private String title;
    private String author;

    ChildrenBook(){}//디폴트
    ChildrenBook(String title, String author){// 메소드
        this.title = title;
        this.author = author;
    }

    public void printInfo(){// 반드시 오버라이딩 해야함
        System.out.println(" ** Info for books **"); 
    }

    public void showTitle(){
        System.out.println("title : " + title); //변수 값
        System.out.println("author : " + author);

    }

}


public class Main {
    public static void main(String[] args){
        ChildrenBook b = new ChildrenBook("Little Mermaid" ,"andersen");
        b.printInfo();
        b.showTitle();
    }
}
