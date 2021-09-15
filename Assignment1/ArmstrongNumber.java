package Assignment1;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongInRange.isArmstrong();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = checkNumber(num);
        if(result)
            System.out.println(num +" is an Armstrong number");
        else
            System.out.println(num +" is not an Armstrong number");
    }

    public static boolean checkNumber(int num){
        int temp = num;
        int sum = 0;
        while(temp != 0){
            int ld = temp % 10;
            sum = sum + ld * ld * ld;
            temp = temp / 10;
        }
        if(sum == num)
            return true;
        return false;
    }
}
