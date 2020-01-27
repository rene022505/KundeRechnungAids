public class mainClass {

    static int getFuckedNico(String in) {
        if (in.length() > 5)
            return 99999;

        while(in.charAt(0) == '0') {
            in = in.substring(1);
        }
        return Integer.parseInt(in);
    }

    public static void main(String[] args) {
        Kunde k = new Kunde(7322357, "Yeet Yeet", "Stuttgarterstraße", getFuckedNico("01271"), "Stuttgart");
    }

}
