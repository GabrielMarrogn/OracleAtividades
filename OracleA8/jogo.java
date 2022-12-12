package OracleA8;


public class jogo {
 private String EquipeA;
private String EquipeB;
private int golsEquipeA;
private int golsEquipeB;
private Double Temperatura;

 public String getEquipeA() {
     return EquipeA;
 }
 public String getEquipeB() {
     return EquipeB;
 }

public int getGolsEquipeA() {
    return golsEquipeA;
}
public int getGolsEquipeB() {
    return golsEquipeB;
}
public Double getTemperatura() {
    return Temperatura;
}
public void setEquipeA(String equipeA) {
    EquipeA = equipeA;
}
public void setEquipeB(String equipeB) {
    EquipeB = equipeB;
}public void setGolsEquipeA(int golsEquipeA) {
    this.golsEquipeA = golsEquipeA;
}public void setGolsEquipeB(int golsEquipeB) {
    this.golsEquipeB = golsEquipeB;
}public void setTemperatura(Double temperatura) {
    Temperatura = temperatura;
}
}
