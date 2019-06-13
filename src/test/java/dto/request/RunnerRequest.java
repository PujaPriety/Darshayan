package dto.request;

import dto.common.Address;
import dto.common.Name;
import lombok.Data;

import java.util.List;

@Data
public class RunnerRequest {
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
