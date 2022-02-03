package abstractest.test4;

public abstract class Book {

    private int code; //book code
    private String title;//book title


    Book(){}
    Book(int code, String title){
        this.code = code;
        this.title = title;
    }

    int getCode(){
        return code;
    }

    String getTitle(){
        return title;
    }

    abstract void printInfo();
    
}
