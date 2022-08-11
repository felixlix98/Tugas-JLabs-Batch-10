package APITest.Tugas5;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;


public class SignupAPITest extends BaseAPITest {
	
	@Test
	public void signup() {
		
	Faker faker = new Faker();
		
		
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String emailAddress = faker.internet().emailAddress();
		String phoneNumber = "+62-"+faker.phoneNumber().cellPhone(); // tidak menggunakan faker phone number karena formatnya tidak sesuai
		
		String payload = "{\r\n"
				+ "    \"currency_id\":2,\r\n"
				+ "    \"email\": \""+emailAddress+"\",\r\n"
				+ "\"first_name\": \""+firstName+"\",\r\n"
				+ "\"last_name\": \""+lastName+"\",\r\n"
				+ "\"password\": \"Builder1231\",\r\n"
				+ "\"phone_number\": \"+62-81351231\",\r\n"
				+ "\"user_type\": \"User\"\r\n"
				+ "\r\n"
				+ "}";
		
		Response responseSignUp = given().spec(commonJsonSpec)
				.body(payload)
				.when().post("/users");
		
		
		assertEquals(responseSignUp.statusCode(), 200);	
		
		
	}

}
