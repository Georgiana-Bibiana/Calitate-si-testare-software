package ro.ase.cts.teste.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.teste.clase.Grupa;
import ro.ase.cts.teste.clase.IStudent;
import ro.ase.cts.teste.clase.Student;

public class TesteGrupaCuFixture {


	private Grupa grupa;
	@Before

	public void setup() {
		grupa=new Grupa(1081);
		for(int i=0; i<20; ++i) {
			IStudent student =new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			
			grupa.adaugaStudent(student);
					
		}
		

		for(int i=0; i<15; ++i) {
			IStudent student =new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			
			grupa.adaugaStudent(student);
					
		}
	}

	@Test(timeout=500)
	public void testGetPromovabilitatePerformance() {
		
		grupa.getPromovabilitate();
	}

}
