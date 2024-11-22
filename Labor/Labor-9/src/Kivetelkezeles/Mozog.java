package Kivetelkezeles;

// Mi az az interfész a Javaban?
// Mi az az absztrakt osztály / metódus?

import Kivetelkezeles.kivetel.HibasIranyException;

public interface Mozog {
    void lefele() throws HibasIranyException, Exception;
    void felfele() throws HibasIranyException, Exception;
}
