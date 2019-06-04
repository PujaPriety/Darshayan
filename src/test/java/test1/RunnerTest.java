package test1;

import com.fasterxml.jackson.core.JsonProcessingException;
import dto.response.CreateRunnerResponse;
import helper.JSONBuilder;
import helper.RequestBuilder;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import utility.Constant;

import java.io.IOException;


public class RunnerTest {
    RequestBuilder requestBuilder = new RequestBuilder();

    @Test
    public void testRunnerCreation() throws JsonProcessingException, IOException {
        RestAssured.baseURI = Constant.baseUri;
        RequestSpecification httpRequest = RestAssured.given().body(requestBuilder.buildRunnerRequest()).header("Content-Type", "application/json");
        Response response = httpRequest.request(Method.POST, Constant.runnerPath);
        System.out.println("Response is:" + response.asString());
        System.out.println("Status code of response is :" + response.statusCode());
        response.then().assertThat().statusCode(200);
        CreateRunnerResponse createRunnerResponse=JSONBuilder.convertJsonToObject(response.getBody().prettyPrint(),CreateRunnerResponse.class);
        assert (createRunnerResponse.getRunnerDetails().getName().getFirstName(),"Mayank")


    }


}
