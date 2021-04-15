package ro.ase.cts.simpleFactory.clase;

public class Medic extends PersonalSpital{

	protected Medic(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		return "Medic: "+super.getNume();
	}
	
	
	

}
