import java.util.ArrayList;

public class Rechnung {

    Kunde kunde;
    ArrayList<Artikel> artikelliste = new ArrayList<>();

    Rechnung(Kunde k) {
        this.kunde = k;
    }

    double getGesamtbetrag() {
        int temp = 0;
        for (Artikel a : artikelliste) {
            temp += a.getPreis();
        }
        return temp;
    }

    public void setArtikel(Artikel art) {
        this.artikelliste.add(art);
    }

    public String drucken() {
        StringBuilder temp = null;
        for (Artikel a : artikelliste) {
            temp.append(a.getNummer()).append(": ").append(a.getBezeichnung()).append("\n");
        }
        return this.kunde + "\n" + temp + "\n" + getGesamtbetrag() + "€";
    }

}
