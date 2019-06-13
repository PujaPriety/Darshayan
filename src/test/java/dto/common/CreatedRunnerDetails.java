package dto.common;

import lombok.Data;

import java.util.List;

@Data
public class CreatedRunnerDetails {
    private String runnerId;
    private Name name;
    private String email;
    private Address address;
    private List<LanguageType> preferredLanguages;
    private String dateOfBirth;
    private String password;
    private String imageString;
    private String registrationId;
    private String mobileNumber;
    private String designation;
    private String reportingManager;
}
