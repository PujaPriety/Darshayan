package dto;

import lombok.Data;
import java.util.Arrays;
import java.util.List;

@Data
public class CreateRunnerRequest {
    private Name name;
    private Address address;
    private String email;
    private List preferredLanguages;
    private String dateOfBirth;
    private String imageUrl;
    private String registrationId;
    private String password;
    private String mobileNumber;
    private String designation;
    private String reportingManager;
    private String authenticationType;


}
