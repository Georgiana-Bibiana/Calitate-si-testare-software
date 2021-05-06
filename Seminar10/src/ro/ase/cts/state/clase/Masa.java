package ro.ase.cts.state.clase;

public class Masa {

	private Stare stare;
	private int numarMasa;
	
	public Masa(int numarMasa) {
		super();
		this.numarMasa = numarMasa;
		this.stare=new StareLibera();
	}

	public Stare getStare() {
		return stare;
	}

	protected void setStare(Stare stare) {
		this.stare = stare;
	}

	public int getNumarMasa() {
		return numarMasa;
	}

	public void rezervaMasa() {
		StareRezervata rezervata=new StareRezervata();
		rezervata.modificaStare(this);
	}
	
	public void ocupaMasa() {
		stareOcupata ocupata=new stareOcupata();
		ocupata.modificaStare(this);
		
	}
	public void elibereazaMasa() {
		StareLibera libera=new StareLibera();
		libera.modificaStare(this);
		
	}
	
}
