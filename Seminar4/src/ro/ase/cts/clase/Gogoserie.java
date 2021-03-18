package ro.ase.cts.clase;

public class Gogoserie {
	
	private String denumire;
	private double capital;
	private int nrStrada;
	
	
	private static Gogoserie instance=null;


	private Gogoserie(String denumire, double capital, int nrStrada) {
		super();
		this.denumire = denumire;
		this.capital = capital;
		this.nrStrada = nrStrada;
	}


	private Gogoserie() {
		this.denumire="Gogoseria Arthur";
		this.capital=5000.50;
		this.nrStrada=45;
	}
	public static synchronized Gogoserie getInstance(String denumire, double capital, int nrStrada) {
		if(instance == null) {
			instance=new Gogoserie(denumire, capital, nrStrada);
		}
		return instance;
	}


	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}


	public void setCapital(double capital) {
		this.capital = capital;
	}
	
	
	public void setNrStrada(int nrStrada) {
		this.nrStrada = nrStrada;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gogoserie [denumire=");
		builder.append(denumire);
		builder.append(", capital=");
		builder.append(capital);
		builder.append(", nrStrada=");
		builder.append(nrStrada);
		builder.append("]");
		return builder.toString();
	}
	
	


}


