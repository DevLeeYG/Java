package bookpkg;

public class Book {

    private int code;
    private String title;
    private int price;

    public Book(){}
    public Book(int code, String title, int price){
        this.code = code;
        this.title = title;
        this.price = price;
        //생성자 앖에 퍼블릭이 붙어야 다른 패키지에서 book 객체를 생성할 수 있습니다.
    }

    public int getCode(){return code;}
    public String getTitle(){return title;}
    public int getPrice(){return price;}

    public void printBookinfo(){
        System.out.println("code: " + code);
        System.out.println("title: " + title);
        System.out.println("price: " + price);

    }

    
    }

    

