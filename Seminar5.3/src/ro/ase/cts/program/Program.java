package ro.ase.cts.program;

import ro.ase.cts.clase.Reteta;

public class Program {
	
	public static void main(String[]args) {
		Reteta reteta1=new Reteta("Reteta1", 250);
		Reteta reteta2=(Reteta) reteta1.copiaza();
		
		System.out.println(reteta1);
		System.out.println(reteta2);
	}

}
