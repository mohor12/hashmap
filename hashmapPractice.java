
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> Ci=new HashMap<>();
        Ci.put("Us",243);
        Ci.put("India",797);
        System.out.println(Ci);
        for(Map.Entry<String,Integer> e: Ci.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> Keys=Ci.keySet();
        for(String Key:Keys){
            System.out.println(Key + ""+Ci.get(Key));
        }

    }
}

output:
{Us=243, India=797}
Us
243
India
797
Us243
India797
