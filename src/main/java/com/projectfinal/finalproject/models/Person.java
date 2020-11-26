package com.projectfinal.finalproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String otherName;
    private String title;
    private String initials;
    private String socialSecurityNumber;
    private String gender;
    private String maritalStatus;

    @ManyToOne
    @JoinColumn(name = "stateid", insertable = false, updatable = false)
    private State state;
    private Integer stateid;

    @ManyToOne
    @JoinColumn(name = "cityid", insertable = false, updatable = false)
    private City city;
    private Integer cityid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private String address;
    private String phone;
    private String mobile;
    private String email;
    private String photo;

}
