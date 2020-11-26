package com.projectfinal.finalproject.models;

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
public class ConstructionMachineHire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "constructionmachineid", insertable = false, updatable = false)
    private ConstructionMachine constructionMachine;
    private Integer constructionmachineid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOut;
    private String timeOut;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateIn;
    private String timeIn;

    @ManyToOne
    @JoinColumn(name = "clientid", insertable = false, updatable = false)
    private Client client;
    private Integer clientid;

    @ManyToOne
    @JoinColumn(name = "locationid", insertable = false, updatable = false)
    private Location location;
    private Integer locationid;

    private String price;

    private String remarks;
}
