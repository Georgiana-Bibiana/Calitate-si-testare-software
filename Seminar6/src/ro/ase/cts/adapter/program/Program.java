package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletAdapter;
import ro.ase.cts.adapter.clase.BiletAdapterClase;
import ro.ase.cts.adapter.clase.IBiletOnline;

public class Program {
	
	private static void rezervareSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	private static void rezervareSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.vindeBiletOnline();
		bilet.rezervaBiletOnline();
	}

	public static void main(String[] args) {
	Bilet bilet=new Bilet(30f);
	rezervareSiAfiseazaBiletLaCasa(bilet);
	
	IBiletOnline adaptor=new BiletAdapter(bilet);
	rezervareSiAfiseazaBiletOnline(adaptor);
	
	IBiletOnline adapterClase=new BiletAdapterClase(50);
	rezervareSiAfiseazaBiletOnline(adapterClase);
	}

}
