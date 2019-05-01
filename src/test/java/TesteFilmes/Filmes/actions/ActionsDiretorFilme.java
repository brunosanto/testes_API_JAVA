package TesteFilmes.Filmes.actions;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import TesteFilmes.Filmes.pageObject.GooglePage;
import io.restassured.response.ResponseBody;

public class ActionsDiretorFilme {

	GooglePage googlePage = new GooglePage();

	public void buscarResultados(WebDriver driver, ResponseBody<?> bodyResponse) {
		String resultado = null;
		try {
			JSONArray diretoresFilmes = new JSONArray(bodyResponse.asString());
			final int numberofitems = diretoresFilmes.length();
			for (int i = 0; i < numberofitems; i++) {
				JSONObject diretorFilme = diretoresFilmes.getJSONObject(i);
				String diretor = diretorFilme.getString("nome");
				String filme = diretorFilme.getString("nomeFilme");

				driver.get("http://www.google.com.br");
				resultado = googlePage.realizarPesquisa(driver, diretor, filme);
				System.out.println(resultado);
			}
		} catch (Exception e) {
			Assert.fail("Message Error: <br/>" + e.getMessage());
		}
	}
}
