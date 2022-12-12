package OracleA4;

import java.util.Scanner;

public class Metodos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ComputeMethods computeMethods = new ComputeMethods();

        System.out.println("Insira a temperatura em celcuis");
        double tempcelcuis = sc.nextDouble();

        System.out.println("Insira o valor do lado A");
        int ladoA = sc.nextInt();
        System.out.println("Insira o valor do lado B");
        int ladoB = sc.nextInt();
        sc.close();

    

        double Tempeture = computeMethods.FToC(tempcelcuis);
        double hypotenusa = computeMethods.hypotenuse(ladoA, ladoB);
        int dado =  computeMethods.roll();

        System.out.println("Temp in celsius is " +Tempeture);
        System.out.println("Hypotenuse is " +hypotenusa);
        System.out.println("The sum of the dice values is " +dado);

    }
    
}
