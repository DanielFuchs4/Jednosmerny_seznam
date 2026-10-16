public class Uchazec {

    private String jmeno;
    private String vzdelani;
    private String pozice;
    private int vek;

    public Uchazec(String jmeno, String vzdelani, String pozice, int vek) {
        this.jmeno = jmeno;
        this.vzdelani = vzdelani;
        this.pozice = pozice;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getVzdelani() {
        return vzdelani;
    }

    public String getPozice() {
        return pozice;
    }

    public int getVek() {
        return vek;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setVzdelani(String vzdelani) {
        this.vzdelani = vzdelani;
    }

    public void setPozice(String pozice) {
        this.pozice = pozice;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }
    @Override
    public String toString() {
        return "Jméno: " + jmeno + " | Věk: " + vek + " let | Vzdělání: " + vzdelani + " | Pozice: " + pozice;
    }
}
