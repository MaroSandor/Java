package Mesedelutan;

import java.util.List;

public class Mese implements Comparable<Mese> {
    private String cim;
    private List<String> szereplok;

    public Mese(String cim, List<String> szereplok) {
        this.cim = cim;
        this.szereplok = szereplok;
    }

    public String getCim() {
        return cim;
    }

    public List<String> getSzereplok() {
        return szereplok;
    }

    public int szereplokSzama() {
        return this.szereplok.size();
    }

    @Override
    public String toString() {
        return cim + ":" + szereplok.size();
    }

    @Override
    public int compareTo(Mese o) {
        if (this.szereplokSzama() == o.szereplokSzama()) {
            return this.cim.compareTo(o.getCim());
        } else {
            return Integer.compare(this.szereplokSzama(), o.szereplokSzama()) * -1;
        }
    }
}
