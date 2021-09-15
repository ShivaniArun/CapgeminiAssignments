package Assignment5;

import java.util.Date;

public class KeyValue {
    public static void main(String[] args) {
        Pair<String,String> obj1 = new Pair<>();
        obj1.setKey("1");
        obj1.setValue("Hello");
        obj1.display();
        Pair<String, Date> obj2 = new Pair<>();
        obj2.setKey("Today is ");
        obj2.setValue(new java.util.Date());
        obj2.display();
    }
}
class Pair<K,V> {
    K key;
    V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public <T> void display(){
        System.out.print(getKey()+" "+getValue()+"\n");
    }
}