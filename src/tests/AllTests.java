package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	UsuarioTestCase.class,
	SexoTestCase.class,
	ReligiaoTestCase.class,
	EtniaTestCase.class,
	PessoaTestCase.class,
	DeficienciaTestCase.class,
	VendaTestCase.class, 
	ItemTestCase.class})


public class AllTests {

}
