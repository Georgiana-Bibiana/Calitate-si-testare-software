package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class iReader {

    protected String filePath; 

    public iReader(String filePath) {
        this.filePath = filePath;
    }
    
    public abstract List<Aplicant> readAplicants () throws FileNotFoundException, NumberFormatException;

    public Aplicant citireAplicant(Scanner input, Aplicant aplicant) {
    	String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nrProiecte = input.nextInt();
        String[] vectorDenumiriProiecte = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++)
        	vectorDenumiriProiecte[i] = input.next();
        
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setVectorProiecte(nrProiecte, vectorDenumiriProiecte);
        
        return aplicant;
    }
}
