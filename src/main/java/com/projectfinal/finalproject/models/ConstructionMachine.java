package com.projectfinal.finalproject.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ConstructionMachine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "constructionmachinetypeid", insertable = false, updatable = false)
    private ConstructionMachineType constructionMachineType;
    private Integer constructionmachinetypeid;

    private String constructionMachineNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisitionDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "constructionmachinemakeid", insertable = false, updatable = false)
    private ConstructionMachineMake constructionMachineMake;
    private Integer constructionmachinemakeid;

    private String power;
    private String fuelCapacity;

    @ManyToOne
    @JoinColumn(name = "constructionmachinestatusid", insertable = false, updatable = false)
    private ConstructionMachineStatus constructionMachineStatus;
    private Integer constructionmachinestatusid;

    private String netWeight;

    @ManyToOne
    @JoinColumn(name = "employeeid", insertable = false, updatable = false)
    private Employee inCharge;
    private Integer employeeid;

    @ManyToOne
    @JoinColumn(name = "constructionmachinemodelid", insertable = false, updatable = false)
    private ConstructionMachineModel constructionMachineModel;
    private Integer constructionmachinemodelid;

    @ManyToOne
    @JoinColumn(name = "locationid", insertable = false, updatable = false)
    private Location currentLocation;
    private Integer locationid;

    private String remarks;



}
