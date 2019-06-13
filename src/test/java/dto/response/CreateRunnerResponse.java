package dto.response;

import dto.common.CreatedRunnerDetails;
import lombok.Data;

@Data
public class CreateRunnerResponse {
    private String status;
    private CreatedRunnerDetails runnerDetails;
}

