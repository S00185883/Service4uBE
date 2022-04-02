package com.S00185883.service4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "service")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="serviceId")
    private Long serviceId;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private double price;
    @Column(name="providerid")
    private long providerid;
}