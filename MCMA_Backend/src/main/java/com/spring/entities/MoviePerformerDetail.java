package com.spring.entities;

import com.spring.enums.PerformerSex;
import com.spring.enums.PerformerType;
import com.spring.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MoviePerformerDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name", length = 50)
    private String name;

    @Column(name = "Performer_Type")
    @Enumerated(EnumType.ORDINAL)
    private PerformerType performerType;

    @Column(name = "Performer_Sex")
    @Enumerated(EnumType.ORDINAL)
    private PerformerSex performerSex;

    @Column(name = "DOB")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(name = "Created_By")
    @Enumerated(EnumType.ORDINAL)
    private Status createdBy;

    @Column(name = "Last_Modified_By")
    @Enumerated(EnumType.ORDINAL)
    private Status lastModifiedBy;

    @Column(name = "Date_Created")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @Column(name = "Date_Updated")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;

    @OneToOne
    @JoinColumn(name = "moviePerformer_id")
    private MoviePerformer moviePerformer;
}
