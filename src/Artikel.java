public abstract class Artikel {

    private int nummer;
    private String bezeichnung;
    double preis;

    public Artikel(int nummer, String bezeichnung, double preis) {
        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public int getNummer() {
        return nummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public abstract double getPreis();
}
