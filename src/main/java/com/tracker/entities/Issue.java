package com.tracker.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "issue")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Inheritance( strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Issue_Type")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer Id;
    private String title;
    private String description;
    private Date createDate;
    private Date modifyDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "developer_id", referencedColumnName = "id")
    private Developer developer;

//    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "create_date")
//    private Date createDate;

//    @UpdateTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "modify_date")
//    private Date modifyDate;

}
