package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class iReader {

    protected String filePath;  // nu private ptr ca ne trebuie la mostenire

    public iReader(String filePath) {
        this.filePath = filePath;
    }

    public abstract List<Aplicant> readAplicants () throws FileNotFoundException, NumberFormatException;


}
