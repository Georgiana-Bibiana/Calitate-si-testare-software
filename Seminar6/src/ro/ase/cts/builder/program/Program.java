package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1;
		
		RezervareBuilder rezervareBuilder=new RezervareBuilder();
		rezervareBuilder.setCodRezervare(100).setAreMancareInclusa(true);
		rezervare1=rezervareBuilder.build();
		
		Rezervare rezervare2=new RezervareBuilder(101).setAreMuzicaAmbientala(true).build();
		Rezervare rezervare3=new Rezervare(102, true, false, false, true, "pop");
		Rezervare rezervare4;
		
		rezervareBuilder.setCodRezervare(104).setAreMuzicaAmbientala(true).setAreScaunErgonomic(true);
		rezervare4=rezervareBuilder.build();
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		System.out.println(rezervare4);
		
		System.out.println("-------Varianta a doua de builder---------");
		
		RezervareBuilderV2 rbv2=new RezervareBuilderV2().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare rezervare5=rbv2.setCodRezervare(140).build();
		Rezervare rezervare6=rbv2.setCodRezervare(150).build();
		
		System.out.println(rezervare5);
		System.out.println(rezervare6);
		
		
	}
	
}
