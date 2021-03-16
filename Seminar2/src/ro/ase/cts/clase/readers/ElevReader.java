package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends iReader{


    public ElevReader(String filePath) {
        super(filePath);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
        Scanner cotinutFisierElevi = new Scanner(new File(super.filePath));
        cotinutFisierElevi.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (cotinutFisierElevi.hasNext()) {
           Elev elev=new Elev();
           super.citireAplicant(cotinutFisierElevi, elev);
           
           int clasa = cotinutFisierElevi.nextInt();
           String tutore = cotinutFisierElevi.next();
            
           elev.setClasa(clasa);
           elev.setTutore(tutore);
            
           elevi.add(elev);
        }

        cotinutFisierElevi.close();
        return elevi;
    }
}
