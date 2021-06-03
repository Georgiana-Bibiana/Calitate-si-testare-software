package ro.ase.cts.teste.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteGrupa.class, TesteGrupaCuFixture.class, TesteGrupaMock.class })
public class SuiteTest {

}
