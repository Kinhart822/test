package com.spring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Member")
@Entity
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Firstname", length = 50, nullable = false)
    private String firstName;

    @Column(name = "Lastname", length = 50, nullable = false)
    private String lastName;

    @Column(name = "Email", length = 50, nullable = false)
    private String email;
}
