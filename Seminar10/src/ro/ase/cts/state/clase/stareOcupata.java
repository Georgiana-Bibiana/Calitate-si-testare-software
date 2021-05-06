package ro.ase.cts.state.clase;

public class stareOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof stareOcupata)) {
			System.out.println("Masa cu numarul "+masa.getNumarMasa() + "poate fi ocupata");
			masa.setStare(this);
		}
		else {
			System.out.println("Masa nu poate fi ocupata!");
		}
		
	}
	
	

}
