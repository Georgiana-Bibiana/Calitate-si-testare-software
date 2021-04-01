package ro.ase.cts.clase;

public class RezervareBuilderV2 implements AbstractBuilder {

	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	public RezervareBuilderV2() {
		this.codRezervare=100;
		this.areMancareInclusa=false;
		this.areBauturaInclusa=false;
		this.areScaunErgonomic=false;
		this.areMuzicaAmbientala=false;
		this.genMuzica="pop";
	}
	
	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}



	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}



	public RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}



	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}



	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}


	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	@Override
	public Rezervare build() {
		return new Rezervare(codRezervare, areMancareInclusa, areBauturaInclusa, areScaunErgonomic, areMuzicaAmbientala, genMuzica);
	}

	
	
}
