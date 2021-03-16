package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentReader extends iReader{


    public StudentReader(String filePath) {
        super(filePath);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
        Scanner continutFisierStudenti = new Scanner(new File(super.filePath));
        continutFisierStudenti.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (continutFisierStudenti.hasNext()) {
            Student student=new Student();
            super.citireAplicant(continutFisierStudenti, student);
            
            int an_studii = continutFisierStudenti.nextInt();
            String facultate = (continutFisierStudenti.next()).toString();
            
            student.setFacultate(facultate);
            student.setAn_studii(an_studii);
           
            studenti.add(student);
            
        }
        continutFisierStudenti.close();
        return studenti;
    }
}
