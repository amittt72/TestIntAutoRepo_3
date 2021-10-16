package BaseFunctionality;

import WebDriver.WebDriverFactory;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

public class APITestBase {

    private static RequestSpecification requestSpecification;
    public void setUp(String url,
                      HashMap headers,
                      HashMap formParams){
        if (requestSpecification == null) {
            RestAssured.baseURI = url;
            RequestSpecification requestSpecification = RestAssured.given();

            if (headers != null)
                requestSpecification.headers(headers);

            if (formParams != null)
                requestSpecification.formParams(formParams);
        }
    }

    public Response post(String basePath, HashMap params, Object body){
        Response response = requestSpecification.given().
        params(params).when().body(body).post(basePath);
        return response;
    }

    public Response get(String basePath, HashMap params){
        Response response = requestSpecification.given().
                params(params).when().get(basePath);
        return response;
    }

}