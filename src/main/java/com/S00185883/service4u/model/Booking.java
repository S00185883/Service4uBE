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
    @Column(name="location")
    private String location;
    @Column(name="date")
    private String date;
    @Column(name="time")
    private String time;
    @Column(name="serviceId")
    private String serviceId;
    @Column(name="customer")
    private String customer;
    @Column(name="providerId")
    private String providerId;


}
