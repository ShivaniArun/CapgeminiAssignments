package Assignment1;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        int[] arr = {5, 12, 14, 6, 78, 19, 1, 62, 94, 18, 67, 15, 39, 78, 10};
        Sorting.applySort(arr);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        checkNumber(arr, n);
    }
    static void checkNumber(int[] arr, int num){
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                System.out.println(num + " found at position "+ (i+1));
                break;
            }
            i++;
        }

    }
}
