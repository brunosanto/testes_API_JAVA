package TesteFilmes.Filmes;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;

import TesteFilmes.Filmes.test.BuscaFilmeGoogle;
import TesteFilmes.Filmes.test.RestAssuredTest;

@RunWith(Suite.class)
@SuiteClasses({ BuscaFilmeGoogle.class, RestAssuredTest.class
})
public class AllTests {

	protected static WebDriver driver;

	public static Boolean isAllTestsExecution = false;

	@BeforeClass
	public static void beforeClass() {
		isAllTestsExecution = true;

	}

}