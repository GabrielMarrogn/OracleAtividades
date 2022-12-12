package OracleA8;

import java.util.ArrayList;

public class LigaFutebol {
    
   private int[][] tabeladeClasifficacao;

   ArrayList<jogo> tabelaJogos;


   public LigaFutebol() {
    tabeladeClasifficacao = new int[4][6];
    tabelaJogos = new ArrayList<jogo>();
   }
     
   public int [][] gettabeladeClasifficacao() {
    return tabeladeClasifficacao;
   }

    }

