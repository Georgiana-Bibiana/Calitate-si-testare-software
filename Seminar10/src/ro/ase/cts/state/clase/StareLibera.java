package ro.ase.cts.state.clase;

public class StareLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Nu putem sa eliberam masa!");
		}
		else {
			masa.setStare(this);
			System.out.println("Masa cu numarul "+masa.getNumarMasa() + "a fost eliberata!");
		}
		
	}

}
