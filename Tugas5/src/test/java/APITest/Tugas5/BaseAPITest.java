package APITest.Tugas5;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseAPITest {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder()
			.setBaseUri("https://api-staging-builder.engineer.ai")
			.setContentType(ContentType.JSON)
			.build().log().all();
}

	

