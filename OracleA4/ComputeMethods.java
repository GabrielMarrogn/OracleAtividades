package OracleA4;

import java.util.Random;

public class ComputeMethods {

    public double FToC(double degreesF){
        double celsius =5/9*(degreesF-32);  
       return celsius;      
   }

   public double hypotenuse(int a, int b){
    double c = Math.sqrt((a * a) + ( b* b));
    return c;
   }

   public int roll(){
    Random random = new Random();
    int randomn = random.nextInt(5) + 1;
    int randomnum = random.nextInt(5) + 1;
    int sum = randomn + randomnum;
    return sum;
   }

}
