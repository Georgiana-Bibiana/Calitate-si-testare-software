package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatReader extends iReader{


    public AngajatReader(String filePath) {
        super(filePath);
    }


    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
        Scanner cotinutFisierAngajati = new Scanner(new File(super.filePath));
        cotinutFisierAngajati.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (cotinutFisierAngajati.hasNext()) {
           Angajat angajat=new Angajat();
           super.citireAplicant(cotinutFisierAngajati, angajat);
           
           int salariu = cotinutFisierAngajati.nextInt();
           String ocupatie = cotinutFisierAngajati.next();
          
           angajat.setOcupatie(ocupatie);
           angajat.setSalariu(salariu);
           
           angajati.add(angajat);
        }
        cotinutFisierAngajati.close();
        return angajati;
    }
}
