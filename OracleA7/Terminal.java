package OracleA7;

public class Terminal {
  public void  transferirCredito(Cartao c1, Cartao c2, int creditos ){
    int saldoDoCartaoc1 = c1.getSaldoAtual();
    int saldoDoCartaoc2 = c2.getSaldoAtual();

    if(saldoDoCartaoc1 >= creditos){
        c1.setSaldoAtual(saldoDoCartaoc1 - creditos);
        c2.setSaldoAtual(saldoDoCartaoc2 + creditos);
        System.out.format("Saldo C1: %d Saldo do C2: %d", c1.getSaldoAtual(), c2.getSaldoAtual());
    }
    else{
        System.out.println("Transferencia não realizada");
    }

  }
  
}
