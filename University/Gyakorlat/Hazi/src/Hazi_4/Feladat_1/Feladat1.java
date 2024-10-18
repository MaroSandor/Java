package Hazi_4.Feladat_1;

public class Feladat1 {
    private int szam;
    private String szoveg;

    public Feladat1(int szam, String szoveg) {
        this.szam = szam;
        this.szoveg = szoveg;
    }

    public int getSzam() {
        return szam;
    }

    public void setSzam(int szam) {
        this.szam = szam;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public int getFaktoriális() {
        int result = 1;

        for (int i = 2; i <= this.szam; i++) {
            result *= i;
        }

        return result;
    }

    public char getLegnagyobbBetű() {
        char maxChar = 'Z';
        for (int i = 0; i < this.szoveg.length(); i++) {
            char currentChar = szoveg.charAt(i);
            if (Character.isLetter(currentChar)) {
                if (currentChar > maxChar) {
                    maxChar = currentChar;
                }
            }
        }
        return maxChar;
    }
}
