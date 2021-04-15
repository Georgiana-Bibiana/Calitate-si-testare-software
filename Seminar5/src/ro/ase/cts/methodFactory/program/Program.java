package ro.ase.cts.methodFactory.program;

import ro.ase.cts.methodFactory.clase.FactoryAsistent;
import ro.ase.cts.methodFactory.clase.FactoryBrancardier;
import ro.ase.cts.methodFactory.clase.FactoryInfirmier;
import ro.ase.cts.methodFactory.clase.IFactory;
import ro.ase.cts.methodFactory.clase.PersonalSpital;

public class Program {
	
	public static  void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
		PersonalSpital personalSpital=factory.getPersonal(nume);
		System.out.println(personalSpital.toString());
	}

	public static void main(String[]args) {
		afisareInformatiiPersonalSpital(new FactoryAsistent(), "Victor");
		afisareInformatiiPersonalSpital(new FactoryBrancardier(), "Bogdan");
		
		afisareInformatiiPersonalSpital(new FactoryInfirmier(), "Ionela");

	}
}
