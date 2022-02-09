package thread.alivejoin;

class ChildThread extends Thread{
    public void run(){
        for(char ch = 'A'; ch<='Z';ch++){
            System.out.print(ch);
        }
    }
}


public class Test {
    public static void main(String[] args){
        Thread th = new ChildThread();
        th.start();
        for(int i =1 ; i<=26; i++){
            System.out.print(i);
        }
        try{
            th.join();//th가 끝날떄까지 기다려야 해서 main메소드가 th메소드가 끝날때까지 기다림
        }catch(InterruptedException ex){
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread ending");

    }
}
