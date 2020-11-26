package com.projectfinal.finalproject.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    private String address;
    private String phone;
    private String mobile;
    private String website;
    private String email;


    @ManyToOne
    @JoinColumn(name = "stateid", insertable = false, updatable = false)
    private State state;
    private Integer stateid;

    @ManyToOne
    @JoinColumn(name = "cityid", insertable = false, updatable = false)
    private City city;
    private Integer cityid;

    private String details;
}
