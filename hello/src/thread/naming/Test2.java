package thread.naming;


class NumberThread extends Thread{
    String name;
    NumberThread(String name){
        this.name = name;

    }

    public void run(){
        System.out.println(name + "starting");
        try{
            for(int i = 0 ; i<10 ; i++){
                Thread.sleep(100);
                System.out.println("IN" + name + ":" + i);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(name + "terminating");
    }
}

class CharThread implements Runnable{
    String name;
    CharThread(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name + "starting");
        try{
            for(char i = 'A' ; i<='J';i++){
                Thread.sleep(100);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(name + "terminating");
    }
}


public class Test2 {
    public static void main(String[] args){
        System.out.println("main starting");
        Thread th1 = new Thread(new NumberThread("Number Thread"));
        Thread th2 = new Thread(new CharThread("Character Thread"));
        th1.start();
        th2.start();
        for(int i = 0; i<10; i++){
            try{
                Thread.sleep(100);
                System.out.println("In main : " + i);

            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("main ending");
    }
}
