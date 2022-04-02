package com.S00185883.service4u.model;


import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customerId")
    private Long customerId;
    @Column(name="name")
    private String name;
    @Column(name="location")
    private String location;


}
