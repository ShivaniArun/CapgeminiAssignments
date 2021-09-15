package Assignment1;

public class ArmstrongInRange {
    public static void isArmstrong(){
        int n = 100;
        while(n <= 999){
            boolean re = ArmstrongNumber.checkNumber(n);
            if(re)
                System.out.print(n + " ");
            n++;
        }
    }
}
