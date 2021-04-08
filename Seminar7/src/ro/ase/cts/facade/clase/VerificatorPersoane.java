package ro.ase.cts.facade.clase;

public class VerificatorPersoane {

	public static boolean esteEligibil(Persoana persoana) {
		if (persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BirouDeCredite.areCredite(persoana)) {
					return false;
				}
			}
		}
		return true;
		
	}
}
