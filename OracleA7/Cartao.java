package OracleA7;

public class Cartao {
   private int saldoAtual;
   private int saldoTiquetes;
   private int numeroCartão;

   //Getters 
   public int getNumeroCartão() {
       return numeroCartão;
   }
   public int getSaldoAtual() {
       return saldoAtual;
   }
   public int getSaldoTiquetes() {
       return saldoTiquetes;
   }

   //Setters
   public void setNumeroCartão(int numeroCartão) {
       this.numeroCartão = numeroCartão;
   }
   public void setSaldoAtual(int saldoAtual) {
       this.saldoAtual = saldoAtual;
   }
   public void setSaldoTiquetes(int saldoTiquetes) {
       this.saldoTiquetes = saldoTiquetes;
   }
}
