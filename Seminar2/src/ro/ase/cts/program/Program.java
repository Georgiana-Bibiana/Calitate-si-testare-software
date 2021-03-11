package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.iReader;

public class Program {

	public static List<Aplicant> citesteAplicanti( iReader reader) throws FileNotFoundException {
		return reader.readAplicants();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantata pentru angajata: "+Angajat.getSumaFinantare());
		System.out.println("Suma finantata pentru student: "+Student.getSumaFinantare());
		System.out.println("Suma finantata pentru elev: "+Elev.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatReader("angajati.txt"));
			Proiect proiect=new Proiect(81);
			
			for(Aplicant aplicant:listaAplicanti)
			{
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());
				
				aplicant.afisareRaspunsProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
