package com.S00185883.service4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// Class
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reviewid;
    private Long providerid;
    private Long customerid;
    private String review;
    private Integer rating;
    private Date date;
}