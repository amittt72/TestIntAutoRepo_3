package Validations;

import io.restassured.response.Response;

import java.util.List;

public class ValidateResponses {
    public boolean validateResponses(Response res1, List<String> dbData, String path){
        List<String> list1 = res1.then().extract().path(path);
        return list1.equals(dbData);
    }
}
