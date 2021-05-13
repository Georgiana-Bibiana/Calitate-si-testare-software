package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.Manager;

public class Program {

	
	
	public static void main (String [] args) {
		Manager manager=new Manager();
		
		Client client1=new Client("Dan");
		Client client2=new Client("Maria");
		Client client3=new Client("Andreea");

		
		manager.adaugaObservator(client1);
		manager.adaugaObservator(client2);
		manager.adaugaObservator(client3);
		
		manager.anuntaMeci("fotbal");
		manager.stergeObservator(client3);
		manager.anuntaMeci("handbal");
	}
}
