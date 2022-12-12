package OracleA5;

import java.util.Scanner;

public class ColorRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor do comprimento da cor");
        int color = sc.nextInt();
        sc.close();

        if(color >= 380 && color < 450){
            System.out.println("The color is Violet");
        }
        else if(color >= 450 && color <495){
            System.out.println("The color is Blue");
        }
        else if(color >= 495 && color < 570){
            System.out.println("The color is Green");
        }
        else if(color >= 570 && color <590){
            System.out.println("The color is Yellow");
        }
        else if (color >= 590 && color <620){
            System.out.println("The color is Orange");
        }
        else if (color >= 620 && color <750){
            System.out.println("The color is Red");
        }
        else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
}
