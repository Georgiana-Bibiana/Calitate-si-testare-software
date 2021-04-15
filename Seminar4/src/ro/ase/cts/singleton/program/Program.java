package ro.ase.cts.singleton.program;

import ro.ase.cts.singleton.clase.Gogoserie;
import ro.ase.cts.singleton.clase.Presedinte;
import ro.ase.cts.singleton.clase.PresedinteLazy;

public class Program {

	public static void main(String[] args) {
		
		Presedinte presedinte1=Presedinte.getInstance();
		Presedinte presedinte2=Presedinte.getInstance();
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		presedinte1.setNume("Basescu");
		presedinte2.setMandat(3);
		
		System.out.println(presedinte1.toString());
		System.out.println(presedinte2.toString());
		
		PresedinteLazy presedinteLazy1=PresedinteLazy.getInstance("PresedinteLazy1", 40, 4);
		PresedinteLazy presedinteLazy2=PresedinteLazy.getInstance("PresedinteLazy2", 50, 1);
		
		System.out.println(presedinteLazy1.toString());
		System.out.println(presedinteLazy2.toString());
		
		presedinteLazy1.setNume("PresedinteLazyModificat");
		System.out.println(presedinteLazy1.toString());
		System.out.println(presedinteLazy2.toString());
		
		Gogoserie gogoserie1=Gogoserie.getInstance("Gogoserie DragSpic", 8000.20, 5);
		Gogoserie gogoserie2=Gogoserie.getInstance("Panini Covrigarie & Gogoserie", 4500.50, 9);
		
		System.out.println(gogoserie1.toString());
		System.out.println(gogoserie2.toString());
		
		
		
	}

}
