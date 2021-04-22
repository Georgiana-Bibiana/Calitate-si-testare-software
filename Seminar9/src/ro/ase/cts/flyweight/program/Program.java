package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Flyweight;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {
	
	public static void main (String [] args) {
		Rezervare rezervare1=new Rezervare(12, 3, 14);
		Rezervare rezervare2=new Rezervare(9, 5, 18);
		Rezervare rezervare3=new Rezervare(2, 3, 9);
		Rezervare rezervare4=new Rezervare(3, 8, 8);
		
		FlyweightFactory flyweightFactory=new FlyweightFactory();
		Flyweight client1=flyweightFactory.getFlyweight("0755438976");
		client1.printeazaRezervare(rezervare1);
		
		flyweightFactory.getFlyweight("0755438976").printeazaRezervare(rezervare2);
		flyweightFactory.getFlyweight("0755438999").printeazaRezervare(rezervare3);
		flyweightFactory.getFlyweight("0755438999").printeazaRezervare(rezervare4);
		
	}

}
