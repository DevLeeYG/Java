package stringbuffer;


class tostringandbuffer{

    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer("Hello world ");
        StringBuffer sb2 = new StringBuffer("Hello world ");

        String a = sb1.toString();
        String b = sb2.toString();

        System.out.println(sb1);

        // if(sb1.equals(sb2)) System.out.println("sb1 equals sb2");
        // else System.out.println("sb1 does not equal sb2");
        if(a.equals(b))System.out.println("equal");
        else System.out.println("not equal");
    }


}
