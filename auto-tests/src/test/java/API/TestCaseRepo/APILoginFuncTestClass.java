package API.TestCaseRepo;

import BaseFunctionality.APITestBase;
import BaseFunctionality.TestBase;
import POJOs.LoginPOJO;
import PageObjects.LoginPage;
import Validations.ValidateResponses;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

public class APILoginFuncTestClass extends APITestBase {

    ValidateResponses validateResponses = new ValidateResponses();

    @BeforeClass
    public void setUp(){
        HashMap headers = new HashMap();
        headers.put("content-type", "application/json");

        HashMap formParams = new HashMap();
        formParams.put("temp", "123");

        setUp("https://www.gmail.com", headers, formParams);
    }

    @Test
    public void testLogin(){
        HashMap params = new HashMap();
        params.put("temp2", "456");

        LoginPOJO loginPOJO = new LoginPOJO();
        loginPOJO.setUserName("admin");
        loginPOJO.setPassword("123");

        Response response = post("/login", params, loginPOJO);
        response.then().statusCode(200);
        response.jsonPath().prettyPrint();
        response.then().assertThat().body("aa.bb", equalTo("aa"));

        List<String> dbData = null; //Get Response from DB
        Assert.assertTrue(validateResponses.validateResponses(response, dbData, "aa.bb"));
    }
}
