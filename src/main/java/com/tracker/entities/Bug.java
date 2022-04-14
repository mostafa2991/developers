package com.tracker.entities;

import com.tracker.enums.Priority;
import com.tracker.enums.Status;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("bug")
public class Bug extends Issue {

    private Integer estimatedPointValue;
    private Status status;
    private Priority priority;
}
