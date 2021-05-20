package ro.ase.cts.teste.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.teste.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuUnParametru() {
		String nume="Costica";
		Student student=new Student(nume);
		
		assertEquals(nume, student.getNume());
		assertNotNull(student.getNote());
		
	}
	
	@Test
	public void testConstrctorFaraParametru() {
		Student student =new Student();
		
		assertNotNull(student.getNume());
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student=new Student();
		int nota=5;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
		
	}
	@Test
	public void testAdaugaNotaDimensiune() {
		Student student=new Student();
		//int nota1=5;
		student.adaugaNota(5);
		//int nota2=8;
		student.adaugaNota(8);
		assertEquals(2, student.getNote().size());
	}
	
	@Test
	public void calculeazaMedie() {
		Student student=new Student();
		
		student.adaugaNota(5);
		student.adaugaNota(8);
		
		assertEquals(6.5, student.calculeazaMedie(),0.1);
	}
	
	@Test
	public void calculeazaMedieFaraNote() {
		Student student=new Student();
		assertEquals(0, student.calculeazaMedie(), 0.1);
	}
	
	@Test
	public void calculeazaMedieCuOSinguraNota() {
		Student student=new Student();
		student.adaugaNota(8);
		assertEquals(8, student.calculeazaMedie(),0.1);
		
	}
	
	@Test
	public void testAreRestanteAdevarat() {
		Student student=new Student();
		student.adaugaNota(9);
		student.adaugaNota(3);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testAreRestanteFals() {
		Student student=new Student();
		student.adaugaNota(9);
		student.adaugaNota(5);
		assertFalse(student.areRestante());
	}
	
	
	
	

}
