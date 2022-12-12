package OracleA7;

public class CategoriaPremio {
    private String nome;
    private int quantidadeTicketsTroca;
    private int quantidadePremiosDisponiveis;

    //Getters
    public String getNome() {
        return nome;
    }
    public int getQuantidadePremiosDisponiveis() {
        return quantidadePremiosDisponiveis;
    }
    public int getQuantidadeTicketsTroca() {
        return quantidadeTicketsTroca;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidadePremiosDisponiveis(int quantidadePremiosDisponiveis) {
        this.quantidadePremiosDisponiveis = quantidadePremiosDisponiveis;
    }
    public void setQuantidadeTicketsTroca(int quantidadeTicketsTroca) {
        this.quantidadeTicketsTroca = quantidadeTicketsTroca;
    }
}
