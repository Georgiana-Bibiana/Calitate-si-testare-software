package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.CompositeAgentie;
import ro.ase.cts.composite.clase.FilialaLeaf;

public class Program {

	public static void main(String[]args) {
		CompositeAgentie agentie01=new CompositeAgentie();
		CompositeAgentie agentie02=new CompositeAgentie();
		CompositeAgentie agentie03=new CompositeAgentie();
		
		FilialaLeaf filiala01=new FilialaLeaf("filiala01");
		FilialaLeaf filiala02=new FilialaLeaf("filiala02");
		FilialaLeaf filiala03=new FilialaLeaf("filiala03");
		FilialaLeaf filiala04=new FilialaLeaf("filiala04");
	
		agentie01.adaugaNod(filiala01);
		agentie01.adaugaNod(filiala02);
		
		agentie02.adaugaNod(filiala03);
		agentie03.adaugaNod(filiala04);
		
		agentie01.adaugaNod(agentie03);
		
		agentie01.afiseazaDescriere();
		System.out.println();
		agentie02.afiseazaDescriere();
		
		agentie03.stergeNod(filiala04);
		agentie01.adaugaNod(filiala04);
		
		agentie01.stergeNod(agentie03);
		
		agentie01.afiseazaDescriere();
		System.out.println();
		agentie02.afiseazaDescriere();
		
		
	}
}
