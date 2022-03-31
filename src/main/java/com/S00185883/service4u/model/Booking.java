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
    private Long bookingId;
    private String name;
    private String location;
    private Date date;
    private Time time;

   // @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private long serviceId;
   // @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private long customerId;



}
