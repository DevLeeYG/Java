package enums;


enum Cardee{
   
        HEART,CLUB,SPADE,DIAMOND;
        // HEART(10),CLUB(20),SPADE(30),DIAMOND(40);

        // private int val;
        // Cardee(int v){val =v;}
        // int getVal(){return val;}

}


public class Cards{

private static final Cardee SPADE = null;

public static void main(String[] args){
    // Cardee cd = Cardee.DIAMOND;
    // System.out.println("Value of cd ; " + cd);

    // cd = Cardee.SPADE;
    // if(cd == Cardee.SPADE) System.out.println("cd is SPADE");

    // switch(cd){
    //     case HEART:
    //     System.out.println("Heart card");
    //     break;
    //     case CLUB:
    //     System.out.println("Club card");
    //     break;
    //     case SPADE:
    //     System.out.println("Spade card");
    //     break;
    //     case DIAMOND:
    //     System.out.println("Diamond card");
    //     break;
    // }
   
    // Cardee cd;
    // System.out.println("print out all cards");
    // System.out.println("-------------------");
    // Cardee all[] = Cardee.values();
    // for(Cardee c: all) System.out. println(c);
    // System.out.println("-------------------");
    // cd= Cardee.valueOf("CLUB");
    // System.out.println("cd == " + cd);

    // Cardee cd ;
    // System.out.println("Value of SPADE : " + Cardee.SPADE.getVal());
    // System.out.println("-----------------------------------");
    // System.out.println("All values of Cards");
    // for(Cardee c : Cardee.values()) System.out.println(c+"value: " + c.getVal());

    Cardee cd1,cd2,cd3;

    for(Cardee c : Cardee.values()) System.out.println(c + ": " + c.ordinal());

    cd1= Cardee.HEART;
    cd2= Cardee.SPADE;
    cd3= Cardee.HEART;

    if(cd1.compareTo(cd2) < 0){
        System.out.println("cd1 <cd2");
    }else{
        System.out.println("cd1>cd2");
    }
    
    if(cd1.compareTo(cd3)==0){
        System.out.println("cd1==cd3");

    }else{
        System.out.println("cd1 != cd3");
    }


}
}
