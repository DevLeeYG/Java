package thread;

class NumberThread extends Thread{
    public void run(){
        for(int i = 1 ; i<=26; i++){
            System.out.print(i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class CharThread extends Thread{
    public void run(){
        for (char ch = 'A'; ch <= 'Z'; ch++){//메인스레드
			System.out.print(ch);
        }
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e.getMessage( ));
            }
    }
}


public class Test1 {
	public static void main(String[] args)
	{
		Thread t1 = new NumberThread( );
        Thread t2 = new CharThread();
        t1.start();//t스레드
        t2.start();
        for(char ch = 'A'; ch<='Z';ch++){
            System.out.print(ch);
        }try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
	}
}
