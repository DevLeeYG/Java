package abstractest.test4;

public class ComputerBook extends Book {

    private int stock;//재고

    ComputerBook(){}
    ComputerBook(int code, String title, int stock){
        super(code, title);
        this.stock = stock;
        }

    void printInfo(){
        System.out.println("Computer Book Info");
        System.out.println("------------------");
        System.out.println("code : " + getCode());
        System.out.println("title: " + getTitle());
        System.out.println("Stock : " + this.stock);
    }
    
}
