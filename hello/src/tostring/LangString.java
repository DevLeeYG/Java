// package tostring;

// public class LangString {

//     String s1 = new String("Hello w 0orld");
//     String s2 = new String("Hello world");
    
//     if(s1 == s2) System.out.println("s1 == s2");
//     else System.out.println("s1 != s2 ");

//     String s3 = "Java Programming";
//     String s4 = "Java Programming";

//     if(s3 == s4) System.out.println("s3 == s4");
//     else System.out.println("s3 != s4");
    
// }
package tostring;

public class LangString  {

    public static void main(String[] args){
        String str = new String("Java Programming");
		System.out.println("str.charAt(7) : " + str.charAt(7));
        String temp = new String("Java Coding");
        System.out.println("str.compareTO(temp) : " + str.compareTo(temp));

        String temp2 = new String("Study");
        System.out.println("str.concat(temp2 : " + str.concat(temp2)); 

        String temp3 = new String("gram");
        String temp4 = new String("coding");
        System.out.println("str.contains(temp3) : " + str.contains(temp3));
        System.out.println("str.contains(temp4) : " + str.contains(temp4));


        System.out.println("str.indedOf('a') : " + str.indexOf('a'));
        System.out.println("str.lastIndexOf('a') : " + str.lastIndexOf('a')); 
        System.out.println("indexOf('u') :" + str.length());
      
        String str2 = str.replace('a','A');
        System.out.println("str.replace('a','A'):" + str2);

        System.out.println(str);
        System.out.println(str.toString());

    }
}