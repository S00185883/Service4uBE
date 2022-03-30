//package com.S00185883.service4u.model;
//
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//public class Booking {
//
//    @Id
//    @GeneratedValue
//    private Long bookingId;
//    @NonNull
//    private String name;
//    private String location;
//    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
//    private Service serviceId;
//    @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
//    private Customer.java customerId;
//
//
//
//}
