package generics;

class Datas<T extends Number> {
	
    T obj;

	Datas(T ob) {
		obj = ob;
	}
	
	int calcMultiple(int n) {
		return obj.intValue( ) * n;
	}
}
public class Test3 {
    public static void main(String[] args){
        Datas<Integer> d = new Datas<Integer>(100);
        int result = d.calcMultiple(5);
        System.out.println(result);

        Datas<Double> e = new Datas<Double>(17.5);
        int result2 = e.calcMultiple(5);
        System.out.println(result2);
    }
}
