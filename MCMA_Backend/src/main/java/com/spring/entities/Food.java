package com.spring.entities;

import com.spring.enums.SizeFoodOrDrink;
import com.spring.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name", length = 20)
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Size")
    @Enumerated(EnumType.STRING)
    private SizeFoodOrDrink size;

    @Column(name = "Price")
    private Integer price;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_id", nullable = false)
    private Cinema cinema;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movieSchedule_id", nullable = false)
    private MovieSchedule movieSchedule;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "food")
    private List<Users> usersList = new ArrayList<>();
}
