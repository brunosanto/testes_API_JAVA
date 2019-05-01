package TesteFilmes.Filmes.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.json.JSONException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TesteFilmes.Filmes.actions.ActionsDiretorFilme;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BuscaFilmeGoogle {

	ActionsDiretorFilme actionsDiretorFilme = new ActionsDiretorFilme();

	public final String CHROME_DRIVE_PATH = new File("").getAbsolutePath() + "\\src\\main\\resources\\drivers\\chromedriver.exe";
	public static WebDriver driver = null;

	@Before
	public void before() {
		File file = new File(CHROME_DRIVE_PATH);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@After
	public void after() {
		driver.quit();
	}

	@Test
	public void buscarDiretorFilmes() throws JSONException {
		try {
			RestAssured.baseURI = "http://localhost:8080";
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.get("/diretor");
			ResponseBody<?> bodyResponse = response.getBody();
			
			actionsDiretorFilme.buscarResultados(driver, bodyResponse);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}	
	}
}
