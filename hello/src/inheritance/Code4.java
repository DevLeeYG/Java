// package inheritance;

// class Parent{

//      private int dataA;

//      Parent(){}
//      Parent(int dataA){
//          this.dataA = dataA;
//      }
//      void printA(){
//          System.out.println("dataA : "+ dataA);
//      }

// }

// class Child extends Parent{
//     private int dataB;

//     Child(){}
//     Child(int dataA, int dataB){
//         super(dataA); //데이터A에 10이 전달이 되었다.
//         this.dataB = dataB;
//     }

//     void printB(){
//         System.out.println("dataB " + dataB);
//     }

// }



// public class Code4 {
//     public static void main(String[] args){
//         Child c = new Child(10,20);
//         c.printA();
//         c.printB();
//     }
// }
