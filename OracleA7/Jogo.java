package OracleA7;

import java.util.Random;

public class Jogo {
   private String nomedoJogo;
   private int quantidadeCreditos;
   private String monitorLCD;
   private String leitorCartaoMagnetico;

   //Setters
   public void setNomedoJogo(String nomedoJogo) {
       this.nomedoJogo = nomedoJogo;
   }
   public void setQuantidadeCreditos(int quantidadeCreditos) {
       this.quantidadeCreditos = quantidadeCreditos;
   }

   //Getters
   public String getNomedoJogo() {
       return nomedoJogo;
   }
   public int getQuantidadeCreditos() {
       return quantidadeCreditos;
   }
   
   //Metodos
   public void passarCartaoParaJogar(Cartao cartao){
    int saldoDoCartao = cartao.getSaldoAtual();
    if(saldoDoCartao >= quantidadeCreditos){
        // Parte que reduz o saldo
        cartao.setSaldoAtual(saldoDoCartao - quantidadeCreditos);
        // Tickets ganhos
        Random random = new Random();
        int ticketsGanhos = random.nextInt(50) + 20;
        // Imprimir numero do cartão
        System.out.format("Pode jogar! %d %d %d ", cartao.getNumeroCartão(), ticketsGanhos, cartao.getSaldoAtual());
    }
    else{
        System.out.println("O cartão não possui saldo suficiente");
    }
   }
}
