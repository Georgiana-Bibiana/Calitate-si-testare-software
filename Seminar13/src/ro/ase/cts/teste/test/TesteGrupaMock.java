package ro.ase.cts.teste.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.teste.clase.Grupa;
import ro.ase.cts.teste.clase.IStudent;
import ro.ase.cts.teste.test.mocks.DummyStudent;

public class TesteGrupaMock {

	@Test
	public void testAdaugaStudent() {
		IStudent student=new DummyStudent();
		Grupa grupa=new Grupa(1081);
		grupa.adaugaStudent(student);
		assertEquals("Adaugare student",1, grupa.getStudenti().size());
		
	}

}
