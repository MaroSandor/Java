package Hazi_3.Feladat_3;

public class Main {
    private String mondat;

    public Main(String mondat) {
        this.mondat = mondat;
    }

    public String getMSHk() {
        String mshk = "aáeéiíoóöőuúüű";
        String result = "";

        for (Character character : mondat.toCharArray()) {
            if (mshk.indexOf(character) == -1) {
                result += character;
            }
        }

        return result;
    }

    public String getLeghosszabSzoMSHi() {
        String[] szavak = mondat.split("\\s+");
        String leghosszabbSzo = "";

        for (String szo : szavak) {
            String tisztitottSzo = szo.replaceAll("[^a-zA-ZáéíóöőúüűÁÉÍÓÖŐÚÜŰ]", "");
            if (tisztitottSzo.length() > leghosszabbSzo.length()) {
                leghosszabbSzo = tisztitottSzo;
            }
        }

        Main longest = new Main(leghosszabbSzo);
        return longest.getMSHk();

    }

    public static void main(String[] args) {
        Main test = new Main("Nem az a lenyeg, hogy hany szo, hanem, hogy melyik a leghosszabb.");

        // System.out.println(test.getMSHk());
        System.out.println(test.getLeghosszabSzoMSHi());
    }
}