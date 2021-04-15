package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Reteta;

public class Program {
	
	public static void main(String[]args) {
		
		Reteta reteta1=new Reteta("Reteta1", 250);
		Reteta reteta2=(Reteta) reteta1.copiaza();
		
		//de realizeaza deep copy
		
		System.out.println(reteta1);
		System.out.println(reteta2);
		Reteta reteta3=new Reteta("Reteta3", 200);
		reteta2=reteta3;
		System.out.println(reteta1);
		System.out.println(reteta2);
		System.out.println(reteta3);
		
		
	}
}
