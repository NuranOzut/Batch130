package LambdaRecap;

public class Apartman {
    String cephe;
    int katSayi;
    int kira;

    public Apartman(String cephe, int katSayi, int kira) {
        this.cephe = cephe;
        this.katSayi = katSayi;
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatSayi() {
        return katSayi;
    }

    public void setKatSayi(int katSayi) {
        this.katSayi = katSayi;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    public Apartman() {
    }

    @Override
    public String toString() {
        return "Apartman{" +
                "cephe='" + cephe + '\'' +
                ", katSayi=" + katSayi +
                ", kira=" + kira +
                '}';
    }
}

