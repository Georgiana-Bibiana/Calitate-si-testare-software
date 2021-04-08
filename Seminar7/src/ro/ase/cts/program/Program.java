package ro.ase.cts.program;

import ro.ase.cts.clase.Persoana;
import ro.ase.cts.clase.VerificatorPersoane;

public class Program {
public static void main(String []args) {
	Persoana pers=new Persoana("Alex", "1234562554675");
	if(VerificatorPersoane.esteEligibil(pers)) {
		System.out.println("Persoana este eligibila");
	}
	else {
		System.out.println("Persoana nu este eligibila");
	}
}
}
