package ru.serafimrest_api.model;

//  author:  ValitovGaziz
//  date:    14.01.2022
//  project: serafimREST_API

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String address;

    private String phone;

}
