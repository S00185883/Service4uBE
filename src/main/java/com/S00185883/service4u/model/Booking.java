package com.S00185883.service4u.model;


import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="bookingId")
    private Long bookingId;
    @Column(name="name")
    private String name;
    @Column(name="location")
    private String location;
    @Column(name="date")
    private Date date;
    @Column(name="time")
    private Time time;
    @Column(name="serviceId")
   // @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private long serviceId;
    @Column(name="customerId")
    // @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private long customerId;



}
