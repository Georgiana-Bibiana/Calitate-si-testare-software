package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.FactoryPersonal;
import ro.ase.cts.simpleFactory.clase.PersonalSpital;
import ro.ase.cts.simpleFactory.clase.TipPersonal;

public class Program {
	
	public static void main(String[]args) {
		FactoryPersonal factoryPersonal=new FactoryPersonal();
		
		PersonalSpital asistent=factoryPersonal.createPersonal(TipPersonal.Asistent, "David");
		
		PersonalSpital medic=factoryPersonal.createPersonal(TipPersonal.Medic, "Ioana");
		
		System.out.println(asistent);
		System.out.println(medic);
		
	}

}
