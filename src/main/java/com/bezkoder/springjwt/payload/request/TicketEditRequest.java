package com.bezkoder.springjwt.payload.request;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketEditRequest {
    private String fullName;
    private String status;
    private String priority;
    private String start;
    private String deadline;
    private String description;
    private int jobId;
    private int levelId;
    private Integer[] pic;
    private Integer[] department;
    private String cvUrl;
    private String newJob;
    private String newLevel;
    private String email;

}
