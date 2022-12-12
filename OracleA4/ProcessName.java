package OracleA4;

import java.util.Scanner;

public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = console.nextLine();
        console.close();
        // your code goes here
        name.indexOf(" ");
        String sub = name.substring(name.indexOf(" "));
        

        System.out.print(sub +", " +name.charAt(0 ));
        

    }
}