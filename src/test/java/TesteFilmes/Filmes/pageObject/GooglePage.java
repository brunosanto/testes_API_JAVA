package TesteFilmes.Filmes.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
public class GooglePage{
	
	public static final String CAMPO_PESQUISA = "q";
	
	public static final String BOTAO_PESQUISAR = "//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]";
	
	public static final String RESULTADO = "resultStats";
	
		
	public String realizarPesquisa(WebDriver driver, String diretor, String filme) throws InterruptedException {

		String resultAproximado = null;
		try {
			driver.findElement(By.name(CAMPO_PESQUISA)).sendKeys(diretor + " " + filme);
			driver.findElement(By.xpath(BOTAO_PESQUISAR)).click();
			resultAproximado = driver.findElement(By.id(RESULTADO)).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultAproximado;
	}
}
