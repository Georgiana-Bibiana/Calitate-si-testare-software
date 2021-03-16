package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float sumaFinantare=10;
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	
	public float getSumaFinantata() {
		return sumaFinantare;
	}
	
	public static float getSumaFinantare() {
		return sumaFinantare;
	}
	
	public Angajat() {
		super();
		
	}
	
	@Override
	public String toString() {
	StringBuilder stringBuilder=new StringBuilder();
	
	stringBuilder.append("Angajat: ").append(super.toString()).append(" ");
	stringBuilder.append("Salariu: ").append(salariu).append(" ");
	stringBuilder.append("Ocupatie: ").append(ocupatie).append(" ");
	
	return stringBuilder.toString();
	}
}
