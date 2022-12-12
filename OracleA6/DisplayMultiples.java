package OracleA6;
import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero:");
        int number = sc.nextInt();
        sc.close();
        System.out.println(" ");
        System.out.println("A TABELA DE " +number +" É:");

        for(int time = 1; time <13; time++){
            int sum = number * time;
            System.out.println(number +" * " + time +" = " +sum);
            
        }
       
    }

}
