package OracleA5;
import java.util.Scanner;

public class TrafficLightChecker2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero refenrente a cor do sinal");
        System.out.println("(Red = 1, Green = 2, yellow = 3)");
        int currentColor = sc.nextInt();
        sc.close();

        switch(currentColor){
            case 1: 
            System.out.println("Next Traffic Light is green");
            break;
            case 2:
            System.out.println("Next Traffic Light is yellow");
            break;
            case 3:
            System.out.println("Next Traffic Light is red");
            default:
            System.out.println("Invalid color");
        }
}
}