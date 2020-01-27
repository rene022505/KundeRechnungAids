public class Volumenlizenz extends Artikel {

    private int anzahl;

    public Volumenlizenz(int nummer, String bezeichnung, double preis, int anzahl) {
        super(nummer, bezeichnung, preis);
        this.anzahl = Math.max(10, anzahl);
    }

    @Override
    public double getPreis() {
        return this.preis * this.anzahl * 0.9;
    }
}
