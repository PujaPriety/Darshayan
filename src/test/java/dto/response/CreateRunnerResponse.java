package dto.response;

import dto.common.Address;
import dto.common.Name;
import lombok.Data;

import java.util.List;

@Data
public class CreateRunnerResponse {
    private String status;
    private String runnerDetils;
    private String runnerId;
    private Name name;
    private Address address;
    private String email;
    private List preferredLanguages;
    private String dateOfBirth;
    private String password;
    private String imageString;
    private String registrationId;
    private String mobileNumber;
    private String designation;
    private String reportingManager;


}

