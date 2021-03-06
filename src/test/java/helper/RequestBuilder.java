package helper;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

import dto.request.LoginRequest;
import dto.request.RunnerRequest;
import dto.common.Name;
import dto.common.Address;
import org.testng.ITestContext;

public class RequestBuilder {
    String requestBody;

    public String buildRunnerRequest(ITestContext context) throws JsonProcessingException {
        RunnerRequest runnerRequest = new RunnerRequest();
        List<Integer> preferredLanguageList = new ArrayList<Integer>();
        preferredLanguageList.add(1);
        preferredLanguageList.add(2);
        Name name = new Name();
        name.setFirstName("Mayank");
        name.setLastName("Kumar");
        runnerRequest.setName(name);
        runnerRequest.setEmail((String) context.getAttribute("email"));
        Address address = new Address();
        address.setAddressLine("10th Cross");
        address.setCity("Bangalore");
        address.setPincode("560017");
        address.setState("Karnataka");
        runnerRequest.setAddress(address);
        runnerRequest.setPreferredLanguages(preferredLanguageList);
        runnerRequest.setDateOfBirth("01-06-2019");
        runnerRequest.setPassword((String) context.getAttribute("password"));
        runnerRequest.setImageUrl("");
        runnerRequest.setRegistrationId("1234");
        runnerRequest.setPassword((String) context.getAttribute("password"));
        runnerRequest.setMobileNumber("7829608292");
        runnerRequest.setDesignation("RUNNER");
        runnerRequest.setReportingManager("Test");
        runnerRequest.setAuthenticationType("Normal");
        requestBody = JSONBuilder.getJson(runnerRequest);
        System.out.println("Runner request is:" + runnerRequest);
        return requestBody;

    }

    public String buildLoginRequest(ITestContext context) throws JsonProcessingException {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUseremail((String) context.getAttribute("email"));
        loginRequest.setPassword((String) context.getAttribute("password"));
        requestBody = JSONBuilder.getJson(loginRequest);
        System.out.println("Request Body is :" + requestBody);
        return requestBody;
    }
}
