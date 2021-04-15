package ro.ase.cts.prototype.clase;

public class Reteta implements PrototipAbstract{
	private String denumireSolutie;
	private int cantitateSolutie;
	
	public Reteta(String denumireSolutie, int cantitateSolutie) {
		//validari
		this.denumireSolutie = denumireSolutie;
		this.cantitateSolutie = cantitateSolutie;
	}
	
	
	private Reteta() {
		//nu mai face validari
	}
	


	@Override
	public String toString() {
		return "Reteta [denumireSolutie=" + denumireSolutie + ", cantitateSolutie=" + cantitateSolutie + "]";
	}


	@Override
	public PrototipAbstract copiaza() {
		
		Reteta copie=new Reteta();
		copie.cantitateSolutie=this.cantitateSolutie;
		copie.denumireSolutie=this.denumireSolutie;
		return copie;
		
	}
	
	
	
	

}
