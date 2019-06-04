package dto.common;

import lombok.Data;

@Data
public class Address {

    private String addressLine;
    private String region;
    private String city;
    private String state;
    private String pincode;
    private String latitude;
    private String longitude;
}
