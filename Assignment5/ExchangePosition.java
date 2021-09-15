package Assignment5;

import java.util.List;

public class ExchangePosition {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        String[] st = {"ABC","DEF","GHI"};
        ChangePositions<Integer> obj = new ChangePositions<>();
        obj.positionInterchange(arr);
        obj.display(arr);
        ChangePositions<String> obj2 = new ChangePositions<>();
        obj2.positionInterchange(st);
        obj2.display(st);
    }
}
class ChangePositions<T> {
    public <T> void positionInterchange(T[] arr){
        T temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
    }

    public <T> void display(T[] arr){
        for(T ele: arr){
            System.out.println(ele);
        }
    }
}