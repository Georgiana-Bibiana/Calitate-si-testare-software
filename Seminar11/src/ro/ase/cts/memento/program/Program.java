package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.Meci;

public class Program {
public static void main(String [] args) {
	Meci meci=new Meci("EchipaGazda", "EchipaOaspeti", 200, 200, 20, 5);
	
	ManagerMemento managerMemento=new ManagerMemento();
	managerMemento.adaugaMemento(meci.creazaMemento());
	
	meci.setNrSpectatori(180);
	managerMemento.adaugaMemento(meci.creazaMemento());
	
	System.out.println(meci.toString());
	meci.seteazaMemento(managerMemento.cereMemento(0));
	
	System.out.println(meci.toString());
	meci.seteazaMemento(managerMemento.cereUltimulMemento());
	System.out.println(meci.toString());
}
}
