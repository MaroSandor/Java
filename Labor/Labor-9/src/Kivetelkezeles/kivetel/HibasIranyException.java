package Kivetelkezeles.kivetel;

public class HibasIranyException extends Exception {
    private int hibakod;

    public HibasIranyException(String message, int hibakod) {
        super(message);
        this.hibakod = hibakod;
    }

    public int getHibakod() {
        return hibakod;
    }
}
