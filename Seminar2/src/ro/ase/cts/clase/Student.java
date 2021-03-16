package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static float sumaFinantare=20;
	
	
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public float getSumaFinantata() {
		return sumaFinantare;
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}
	
	
	public Student() {
		super();
		
	}
	

	@Override	
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		
		stringBuilder.append("Student: ").append(super.toString()).append(" ");
		stringBuilder.append("Facultate= ").append(facultate).append(" ");
		stringBuilder.append("An studii ").append(an_studii).append(" ");
		
		return stringBuilder.toString();
		
	}
}
