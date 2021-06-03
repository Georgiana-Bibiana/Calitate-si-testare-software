package ro.ase.cts.teste.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.teste.clase.Grupa;
import ro.ase.cts.teste.clase.IStudent;
import ro.ase.cts.teste.test.mocks.DummyStudent;
import ro.ase.cts.teste.test.mocks.FakeStudent;
import ro.ase.cts.teste.test.mocks.StubStudent;

public class TesteGrupaMock {

	@Test
	public void testAdaugaStudent() {
		IStudent student=new DummyStudent();
		Grupa grupa=new Grupa(1081);
		grupa.adaugaStudent(student);
		assertEquals("Adaugare student",1, grupa.getStudenti().size());
		
	}
	
	public void testGetPromovabilitate() {
		IStudent student=new StubStudent();
		Grupa grupa=new Grupa(1081);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.001);
	}

	public void testGetPromovabilitateFakeStudent() {
		Grupa grupa=new Grupa(1081);
		for(int i=0; i<8; i++) {
			//grupa.adaugaStudent(new FakeStudent());
			FakeStudent student=new FakeStudent();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
			
		}
		assertEquals(0.8f, grupa.getPromovabilitate(), 0.01);
	}
}
