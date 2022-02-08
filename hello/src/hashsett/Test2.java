package hashsett;
import java.util.HashSet;
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name +":" + age;
    }

    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person temp = (Person)obj;
            return name.equals(temp.name) && age == temp.age;
        }
        return false;
    }
    public int hashCode(){
        return name.hashCode()+age;
    }

}


public class Test2 {
    public static void main(String[] args){
        HashSet<Object> set = new HashSet<Object>();
        set.add(new String("Alice"));
        set.add(new String("Alice"));
        set.add(new Person("Robert", 10));
        set.add(new Person("Robert",10));
        System.out.println(set);
    }
    
}
//String 객체 중복제거와 Person은 동일 데이터로 판단x로 두번 저장됨