package hashmapp;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<>();
        map.put("david", "qwer123");
        map.put("cindy","9abcd9");
        map.put("alice","abc999");
        map.put("paul","asdf5757");
        map.put("mary","good");

        Set<String> keySet = map.keySet();//key만 뽑기
        System.out.println(keySet);
        System.out.println("-----------------");

        for(Map.Entry<String,String> e : map.entrySet()){//모든 엔트리 반환
            String key = e.getKey(); // 키
            String value = e.getValue();// 벨류 가져옴 
            System.out.println(key + " : " + value);
        }
            System.out.println("---------------------");
            String val = (String)map.get("alice");//map.get(key);
            System.out.println("Value for key alice is :"+ val);
        
       
    }
    
    
}
