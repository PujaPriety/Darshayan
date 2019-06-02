package dto;

import lombok.Data;

@Data
public class Address {

    private String addressLine;
    private String city;
    private String state;
    private String pincode;
}
