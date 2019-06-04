package dto.response;

import dto.common.RunnerDetails;
import lombok.Data;

@Data
public class CreateRunnerResponse {
    private String status;
    private RunnerDetails runnerDetails;
}

