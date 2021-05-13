package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaDeSport {
	
	private List<Observator> colectieObservator;

	public ManagerSalaDeSport() {
		super();
		this.colectieObservator = new ArrayList<>();
	}
	
	public void adaugaObservator(Observator observator) {
		colectieObservator.add(observator);
	}
	
	public void stergeObservator(Observator observator) {
		colectieObservator.remove(observator);
	}
	
	public void notificaObservatori(String mesajNotificare) {
		for(Observator o : colectieObservator) {
			o.primesteMesaj(mesajNotificare);
		}
	}

}
