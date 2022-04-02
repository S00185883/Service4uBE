package com.S00185883.service4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="reviewid")
    private Long reviewid;
    @Column(name="providerid")
    private Long providerid;
    @Column(name="customerid")
    private Long customerid;
    @Column(name="review")
    private String review;
    @Column(name="rating")
    private Integer rating;
    @Column(name="date")
    private Date date;
}