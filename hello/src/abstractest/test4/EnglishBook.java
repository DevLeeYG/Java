package abstractest.test4;

public class EnglishBook extends Book {

    private int publishedYear;//출판연도

    EnglishBook(){}
    EnglishBook(int code, String title, int publishedYear){
        super(code, title);
        this.publishedYear = publishedYear;
    }

    void printInfo(){
        System.out.println("English Book info");
        System.out.println("-----------------");
        System.out.println("code  : " + getCode());
        System.out.println("title : " + getTitle());
        System.out.println("publishedYear: " + this.publishedYear);
    }
    
}
