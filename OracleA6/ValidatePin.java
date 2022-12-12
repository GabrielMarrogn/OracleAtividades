package OracleA6;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int pinValid = 0;

        
        
        while(pin != pinValid ){
            System.out.println("Insira o pin valido:");
            pinValid = sc.nextInt();
            if (pinValid != pin){
                System.out.println(" ");
                System.out.println("Pin is invalid!");
                System.out.println(" ");
            }

            
        }
        sc.close();
        System.out.println("Pin correct");
    }
}
