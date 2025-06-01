package com.project.dbms_mini_project_backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "buses")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String route;
    @Column(name = "departure_time")
    @JsonProperty("departure")
    private String departureTime; // New field

    @Column(name = "arrival_time")
    @JsonProperty("arrival")
    private String arrivalTime;   // New field
    private String status;    // New field
    public String getRoute() { return route; }
    public String getDepartureTime() { return departureTime; }
    public String getArrivalTime() { return arrivalTime; }
    public String getStatus() { return status; }
    // Getters and setters
}

