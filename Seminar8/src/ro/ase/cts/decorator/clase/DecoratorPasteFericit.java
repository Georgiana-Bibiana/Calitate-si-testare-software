package ro.ase.cts.decorator.clase;

public class DecoratorPasteFericit extends DecoratorAbstract {

	public DecoratorPasteFericit(INota nota) {
		super(nota);
	
	}

	@Override
	public void printeaza() {
		
		super.printeaza();
		System.out.println("Paste fericit!");
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("FELICITARE: Paste Fericit");
		
	}

}
