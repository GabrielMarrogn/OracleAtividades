package OracleA8;

import java.util.Scanner;

public class TesteLiga {

    public static void main(String args[]){

        LigaFutebol liga = new LigaFutebol();

        Scanner sc = new Scanner(System.in);

        int TemperaturaBaixasemSequencia = 3;
        double TemperaturaDoJogo;

        while (TemperaturaBaixasemSequencia > 0){
            TemperaturaDoJogo = sc.nextDouble();
            if (TemperaturaDoJogo > 0) {
                TemperaturaBaixasemSequencia = 3;

             jogo jogo1 = new jogo();

             jogo1.setEquipeA(sc.nextLine());
             jogo1.setEquipeB(sc.nextLine());

             int golsB = sc.nextInt();

             jogo1.setGolsEquipeA(golsB);
             jogo1.setGolsEquipeB(golsB);
             jogo1.setTemperatura(TemperaturaDoJogo);

             
        
             jogo jogo2 = new jogo();
             jogo2.setEquipeA(sc.nextLine());
             jogo2.setEquipeB(sc.nextLine());
             jogo2.setGolsEquipeA(golsB);
             jogo2.setGolsEquipeB(golsB);
             jogo2.setTemperatura(TemperaturaDoJogo);


                
            } else {
                TemperaturaBaixasemSequencia --;
            }
        } 
     sc.close();  
    }
}
