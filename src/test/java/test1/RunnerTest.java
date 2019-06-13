package test1;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import dto.response.CreateRunnerResponse;
import helper.JSONBuilder;
import helper.RequestBuilder;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.Constant;

import java.io.IOException;
import java.util.List;


public class RunnerTest {
    RequestBuilder requestBuilder = new RequestBuilder();
    String access_Token;

    @BeforeClass
    public void setUP() {
        RestAssured.baseURI = Constant.baseUri;

    }

    @Test
    public void testRunnerCreation(ITestContext context) throws JsonProcessingException, IOException {
        context.setAttribute("email", "Mayankkumar0098@cars24.com");
        context.setAttribute("password", "pass");
        RequestSpecification requestSpecification = RestAssured.given().body(requestBuilder.buildRunnerRequest(context)).header("Content-Type", "application/json");
        Response response = requestSpecification.request(Method.POST, Constant.runnerPath);
        System.out.println("Response is:" + response.asString());
        System.out.println("Status code of response is :" + response.statusCode());
        response.then().assertThat().statusCode(200);
        CreateRunnerResponse createRunnerResponse = JSONBuilder.convertJsonToObject(response.getBody().prettyPrint(), CreateRunnerResponse.class);
        Assert.assertEquals(createRunnerResponse.getRunnerDetails().getName().getFirstName(), "Mayank");
        Assert.assertEquals(createRunnerResponse.getRunnerDetails().getName().getLastName(), "Kumar");
        Assert.assertEquals(createRunnerResponse.getRunnerDetails().getEmail(), context.getAttribute("email"));
        List preferredLanguagesList = createRunnerResponse.getRunnerDetails().getPreferredLanguages();
        Assert.assertEquals(createRunnerResponse.getRunnerDetails().getPreferredLanguages().size(), 2);
        //Assert.assertEquals(preferredLanguagesList.get(0));
    }

    @Test
    public void testRunnerLogin(ITestContext context) throws JsonProcessingException {
        RequestSpecification requestSpecification = RestAssured.given().body(requestBuilder.buildLoginRequest(context)).header("Content-Type", "application/json");
        Response response = requestSpecification.request(Method.POST, Constant.loginRunnerPath);
        JsonPath jsonPath = new JsonPath(response.asString());
        String token = jsonPath.getString("token");
        context.setAttribute(access_Token, token);
        System.out.println("Token value is" + context.getAttribute("access_Token"));
        Assert.assertEquals(response.getStatusCode(), 200);

    }

}
