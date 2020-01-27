public class Kunde {

    private int plz, kundennummer;
    private String name, strasse, ort;

    Kunde(int knr, String name, String str, int plz, String ort) {
        this.kundennummer = knr;
        this.name = name;
        this.strasse = str;
        this.plz = plz > 0 && plz < 100000 ? plz : 99999;
        this.ort = ort;
    }

    public int getPlz() {
        return plz;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public String getName() {
        return name;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getOrt() {
        return ort;
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        StringBuilder temp2 = new StringBuilder(Integer.toString(this.plz));

        if (this.plz < 100000) {
            while (temp2.length() < 5) {
                temp2.insert(0, "0");
            }
        }

        temp.append("Kundennummer: ").append(this.kundennummer).append("\n").append("Name: ").append(this.name).append("\n").append("Straße: ").append(this.strasse).append("\n").append("Ort: ").append(this.ort).append(", ").append(temp2).append("\n");
        return String.valueOf(temp);
    }
}
