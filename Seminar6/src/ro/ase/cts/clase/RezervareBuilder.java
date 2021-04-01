package ro.ase.cts.clase;

public class RezervareBuilder  implements AbstractBuilder{
	private Rezervare rezervare;
	
	

	public RezervareBuilder() {
		super();
		this.rezervare=new Rezervare(0, false, false, false, false, "notFound");
	}

	public RezervareBuilder(int codRezervare) {
		super();
		this.rezervare=new Rezervare(codRezervare, false, false, false, false, "notFound");
	}

	public RezervareBuilder setCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	}
	
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}


	@Override
	public Rezervare build() {
		
		return rezervare;
	}
	
}
