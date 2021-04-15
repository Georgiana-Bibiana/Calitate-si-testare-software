package ro.ase.cts.methodFactory.clase;

public class Infirmier extends PersonalSpital{

	public Infirmier(String nume) {
		super(nume);
		
	}

	@Override
	public String toString() {
		return "Infirmier: "+super.getNume();
	}
	
	

	
}
