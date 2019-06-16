package com.Flexera.FTR.dto.response;

import com.Flexera.FTR.dto.common.CreatedRunnerDetails;
import lombok.Data;

@Data
public class CreateRunnerResponse {
    private String status;
    private CreatedRunnerDetails runnerDetails;
}

