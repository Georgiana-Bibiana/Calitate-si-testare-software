package ro.ase.cts.composite.clase;

public class FilialaLeaf implements ISediu{
private String numeFiliala;

	public FilialaLeaf(String numeFiliala) {
	super();
	this.numeFiliala = numeFiliala;
}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Filiala : "+ numeFiliala);
		
	}

	@Override
	public void adaugaNod(ISediu sediu) throws Exception {
	throw new Exception("Nu este implementat");
		
	}

	@Override
	public void stergeNod(ISediu sediu) throws Exception {
		throw new Exception("Nu este implementat");
		
	}

	@Override
	public ISediu getNod(int pozitie) throws Exception {
		throw new Exception("Nu este implementat");
	}

}
