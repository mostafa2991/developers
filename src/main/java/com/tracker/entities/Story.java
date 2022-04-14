package com.tracker.entities;

import com.tracker.enums.Status;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("story")
public class Story extends Issue {

    private Integer estimatedPointValue;
    private Status status;

}
