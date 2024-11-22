package MintaZH;

public class Befektetes implements Comparable<Befektetes> {
    private double toke;
    private int futamido;
    private double kamat;

    public Befektetes(double toke, int futamido, double kamat) {
        this.toke = toke;
        this.futamido = futamido;
        this.kamat = kamat;
    }

    public double getToke() {
        return toke;
    }

    public void setToke(double toke) {
        this.toke = toke;
    }

    public int getFutamido() {
        return futamido;
    }

    public void setFutamido(int futamido) {
        this.futamido = futamido;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public double getLejaratiToke() {
        return this.toke * Math.pow(1 + this.kamat / 100, this.futamido);
    }

    @Override
    public int compareTo(Befektetes befektetes) {
        return Double.compare(this.getLejaratiToke(), befektetes.getLejaratiToke());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Befektetes)) {
            return false;
        }

        Befektetes bef = (Befektetes) obj;

        return this.getLejaratiToke() == bef.getLejaratiToke();
    }
}
