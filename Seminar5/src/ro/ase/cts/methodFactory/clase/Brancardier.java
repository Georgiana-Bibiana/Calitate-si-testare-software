package ro.ase.cts.methodFactory.clase;

public class Brancardier extends PersonalSpital {
public Brancardier(String nume) {
	super(nume);
}

@Override
public String toString() {
	return "Brancardier: "+super.getNume();
}


	
}
