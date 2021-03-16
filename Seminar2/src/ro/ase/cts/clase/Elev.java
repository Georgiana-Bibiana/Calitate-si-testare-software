package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantare=30;
	
	
	public void setClasa(int i) {
		this.clasa = i;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	public float getSumaFinantata() {
		return sumaFinantare;
	}
	
	public static float getSumaFinantare() {
		return sumaFinantare;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		
		stringBuilder.append("Elev: ").append(super.toString()).append(" ");
		stringBuilder.append("Clasa: ").append(clasa).append(" ");
		stringBuilder.append("Tutore ").append(tutore).append(" ");
		
		return stringBuilder.toString();
		
	}
	
	public Elev() {
		super();
	}
	
}
