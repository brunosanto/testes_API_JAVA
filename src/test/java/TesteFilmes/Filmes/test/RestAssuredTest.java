package TesteFilmes.Filmes.test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.jayway.restassured.http.ContentType;
public class RestAssuredTest {
	
	@Test
	public void restAssuredTeste() {
		String url = "http://jsonplaceholder.typicode.com/todos/1";
		given()
		.relaxedHTTPSValidation()
		.when()
		.get(url)
		.then()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.body("userId", is(1))
		.body("title", is("delectus aut autem"))
		.body("completed", is(false));
	}
}

