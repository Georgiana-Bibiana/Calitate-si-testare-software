package ro.ase.cts.adapter.clase;

public class Bilet {
private float pret;

//Aplicatia initiala  care rezerva si vinde bilete 
public Bilet(float pret) {
	super();
	this.pret = pret;
}

public void vanzare() {
	System.out.println("S-a vandut biletul: "+this.pret);
}

public void rezervare() {
	System.out.println("S-a rezervat biletul: "+this.pret);
}

}
