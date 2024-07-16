package org.example.test.entity;

import jakarta.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true)
    private String fullName;

    @Column(unique = false)
    private String email;

    private String address;

    private Integer zipCode;
}
