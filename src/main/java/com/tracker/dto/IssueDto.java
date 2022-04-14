package com.tracker.dto;

import com.tracker.entities.Developer;
import com.tracker.enums.IssueType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IssueDto {

    private static final int CHR_MIN = 5;
    private static final int CHR_MAX = 20;

    @Size(max = CHR_MAX, min = CHR_MIN)
    @NotNull
    @NotBlank(message = "not allow for empty title")
    private String title;
    @Size(max = CHR_MAX, min = CHR_MIN)
    @NotNull
    @NotBlank(message = "not allow for empty description")
    private String description;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;
    @NotNull
    private Integer developerId;
    @NotNull
    private IssueType issueType;






}
