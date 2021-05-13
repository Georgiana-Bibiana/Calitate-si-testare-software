package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Program {
	
	public static void main(String[] args) {
		
		SpectatorAbstract spectator1 = new Spectator("Ion");
		SpectatorAbstract spectator2 = new SpectatorVIP("Maria");
		
		spectator1.intrareInStadion();
		spectator2.intrareInStadion();
	}

}
