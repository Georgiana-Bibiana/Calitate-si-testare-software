package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuLaMultiAni;
import ro.ase.cts.decorator.clase.DecoratorPasteFericit;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Program {

	public static void main(String[] args) {
		NotaDePlata notaInitiala=new NotaDePlata(55);
		notaInitiala.printeaza();
		
		System.out.println();
		
		DecoratorAbstract decoratorLaMultiAni=new DecoratorCuLaMultiAni(notaInitiala);
		decoratorLaMultiAni.printeazaFelicitare();
		System.out.println();
		decoratorLaMultiAni.printeaza();
		System.out.println();
		
		DecoratorAbstract decoratorPasteFericit=new DecoratorPasteFericit(notaInitiala);
		decoratorPasteFericit.printeaza();
		System.out.println();
		NotaDePlata notaDePlata=new NotaDePlata(150);
		DecoratorAbstract decoratorLaMultiAni2=new DecoratorCuLaMultiAni(notaDePlata);
		
		DecoratorAbstract decoratorPasteFericit2 =new DecoratorPasteFericit(decoratorLaMultiAni2);
		decoratorPasteFericit2.printeaza();
		
	}

}
