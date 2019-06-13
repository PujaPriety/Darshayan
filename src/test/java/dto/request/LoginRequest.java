package dto.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String useremail;
    private String password;
}
