public class Einzellizenz extends Artikel {

    Einzellizenz(int nr, String bezeichnung, double preis) {
        super(nr, bezeichnung, preis);
    }

    @Override
    public double getPreis() {
        return this.preis * 1.1;
    }
}
