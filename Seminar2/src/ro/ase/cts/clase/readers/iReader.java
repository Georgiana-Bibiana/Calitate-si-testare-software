package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class iReader {

    protected String filePath;  // nu private ptr ca ne trebuie la mostenire

    public iReader(String filePath) {
        this.filePath = filePath;
    }
    
    

    public abstract List<Aplicant> readAplicants () throws FileNotFoundException, NumberFormatException;

    
    public Aplicant citireAplicant(Scanner input, Aplicant aplicant) {
    	String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nr = input.nextInt();
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();
        
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setVectorDenumiri(nr, vect);
        
        return aplicant;
        
       
    }

}
