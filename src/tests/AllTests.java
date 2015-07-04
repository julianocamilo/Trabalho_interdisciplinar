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
	ItemTestCase.class,
	ProdutoTestCase.class,
	ServicoTestCase.class, 
	TurmaTestCase.class,
	CursoTestCase.class,
	TelefoneTestCase.class,
	TipoFiliacaoTestCase.class,
	DiaTestCase.class,
	HorarioTestCase.class})


public class AllTests {

}
