package Assignment5;

import java.util.HashMap;
import java.util.Map;

public class RandomValues {
    public static void main(String[] args) {
        HashMap<Integer,Double> map = new HashMap<>();
        map.put(5,6.0);
        map.put(6,6.1);
        map.put(7,6.2);
        map.put(8,6.3);
        map.put(9,6.4);
        map.put(10,6.5);
        map.put(11,6.6);
        map.put(12,6.7);
        map.put(13,6.8);
        map.put(14,6.9);
        for(Map.Entry<Integer,Double> m: map.entrySet()){
            System.out.println("key : "+m.getKey()+" Value: "+m.getValue());
        }
    }
}
