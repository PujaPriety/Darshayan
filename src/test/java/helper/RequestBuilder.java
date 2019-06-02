package helper;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;

public class RequestBuilder {

    public String buildRunnerRequest() throws JsonProcessingException {
        CreateRunnerRequest createRunnerRequest=new CreateRunnerRequest();
        List<Integer> preferredLanguageList= new ArrayList<Integer>();
        preferredLanguageList.add(1);
        preferredLanguageList.add(2);
        Name name=new Name();
        name.setFirstName("Mayank");
        name.setLastName("Kumar");
        createRunnerRequest.setName(name);
        createRunnerRequest.setEmail("Mayankkumar0079@cars24.com");
        Address address=new Address();
        address.setAddressLine("10th Cross");
        address.setCity("Bangalore");
        address.setPincode("560017");
        address.setState("Karnataka");
        createRunnerRequest.setAddress(address);
        createRunnerRequest.setPreferredLanguages(preferredLanguageList);
        createRunnerRequest.setDateOfBirth("01-06-2019");
        createRunnerRequest.setImageUrl("");
        createRunnerRequest.setRegistrationId("1234");
        createRunnerRequest.setPassword("pass");
        createRunnerRequest.setMobileNumber("7829608292");
        createRunnerRequest.setDesignation("RUNNER");
        createRunnerRequest.setReportingManager("Test");
        createRunnerRequest.setAuthenticationType("Normal");
        String runnerRequest=JSONBuilder.getJson(createRunnerRequest);
        System.out.println("Runner request is:" + runnerRequest);
        return runnerRequest;

    }
}
