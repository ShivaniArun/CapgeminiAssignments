package Assignment1;

import java.util.Scanner;

public class LoginApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while(counter < 3){
            System.out.println("Enter the user id : " );
            String userId =  sc.nextLine();
            System.out.println("Enter the password : " );
            String password =  sc.nextLine();
            System.out.println("Welcome to the Application " + userId);
            counter++;
        }
        if(counter > 2)
            System.out.println("Contact Admin");
    }
}
