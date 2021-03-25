package ro.ase.cts.program;

import ro.ase.cts.clase.FactoryPersonal;
import ro.ase.cts.clase.PersonalSpital;
import ro.ase.cts.clase.TipPersonal;

public class Program {
	
	public static void main(String[]args) {
		FactoryPersonal factoryPersonal=new FactoryPersonal();
		
		PersonalSpital asistent=factoryPersonal.createPersonal(TipPersonal.Asistent, "David");
		
		PersonalSpital medic=factoryPersonal.createPersonal(TipPersonal.Medic, "Ioana");
		
		System.out.println(asistent);
		System.out.println(medic);
		
	}

}
