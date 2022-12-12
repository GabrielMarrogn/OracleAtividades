package OracleA7;

public class ProgramaFliperama {
    public static void main(String args[]){

        Jogo asterois = new Jogo();

        asterois.setNomedoJogo("Asteroids Atari");
        asterois.setQuantidadeCreditos(50);

        Cartao cartao1 =new Cartao();
        Cartao cartao2 = new Cartao();

        cartao1.setSaldoAtual(100);
        cartao2.setSaldoAtual(200);

        asterois.passarCartaoParaJogar(cartao1);

        System.out.println(cartao1.getSaldoAtual());

        Terminal t1 = new Terminal();
        t1.transferirCredito(cartao2, cartao1, 100);
    }
}
