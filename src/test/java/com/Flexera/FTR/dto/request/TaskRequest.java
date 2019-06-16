package com.Flexera.FTR.dto.request;

import com.Flexera.FTR.dto.common.Address;
import lombok.Data;

import java.util.List;

@Data
public class TaskRequest {
    private String customerFirstName;
    private String customerLastName;
    private Address documentPickupAddress;
    private String slotStartTime;
    private String slotEndTime;
    private Long leadId;
    private String eligibleBank;
    private String phoneNumber;
    private Long assignedRunner;
    private List<String> documentTypes;
    private String reassignReason;



}
