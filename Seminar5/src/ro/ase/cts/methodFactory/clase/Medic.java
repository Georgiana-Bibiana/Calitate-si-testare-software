package ro.ase.cts.methodFactory.clase;

public class Medic extends PersonalSpital{

	protected Medic(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		return "Medic: "+super.getNume();
	}
	
	
	

}
