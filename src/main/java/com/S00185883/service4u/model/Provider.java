package com.S00185883.service4u.model;//package com.S00185883.service4u.model;
//import javax.persistence.*;
//
////mark class as an Entity
//@Entity
////defining class name as Table name
//@Table(name = "provider")
//public class Provider
//{
//    //Defining book id as primary key
//    @Id
//    @Column
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long providerid;
//    @Column(name = "providername")
//    private String providername;
//    @Column(name = "addressLineOne")
//    private String addressLineOne;
//    @Column(name = "addressLineTwo")
//    private String addressLineTwo;
//    @Column(name = "town")
//    private String town;
//    @Column(name = "county")
//    private String county;
//    @Column(name = "eircode")
//    private String eircode;
////    @ManyToOne
////    @JoinColumn(name = "sectorId")
////    private Sector sector;
//    public Provider() {
//    }
//    public Provider(String name, String address1, String address2, String town, String county, String eircode) {
//        this.providername = name;
//        this.addressLineOne = address1;
//        this.addressLineTwo = address2;
//        this.town = town;
//        this.county = county;
//        this.eircode = eircode;
////        this.sector=sector;
//
//    }
//
//    public long getProviderid()
//    {
//        return providerid;
//    }
//    public String getProvidername()
//    {
//        return providername;
//    }
//    public void setProvidername(String providername)
//    {
//        this.providername = providername;
//    }
//    public String getaddressLineOne()
//    {
//        return addressLineOne;
//    }
//    public void setaddressLineOne(String addressLineOne)
//    {
//        this.addressLineOne = addressLineOne;
//    }
//    public String getaddressLineTwo()
//    {
//        return addressLineTwo;
//    }
//    public void setaddressLineTwo(String addressLineTwo)
//    {
//        this.addressLineTwo = addressLineTwo;
//    }
//    public String getTown()
//    {
//        return town;
//    }
//    public void setTown(String town)
//    {
//        this.town = town;
//    }
//    public String getCounty()
//    {
//        return county;
//    }
//    public void setCounty(String county)
//    {
//        this.county = county;
//    }
//    public String getEircode()
//    {
//        return eircode;
//    }
//    public void setEircode(String eircode)
//    {
//        this.eircode = eircode;
//    }
////    public Sector getSector()
////    {
////        return sector;
////    }
////    public void setSector(Sector sector)
////    {
////        this.sector = sector;
////    }
//    @Override
//    public String toString() {
//        return "Provider [id=" + providerid + ", name=" + providername + ", address=" + addressLineOne + addressLineTwo+town+county+eircode + "]";
//    }
//
//}
// Importing required classes
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "provider")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long providerId;
    private String providername;
    private String addressLineOne;
    private String addressLineTwo;
    private String town;
    private String county;
    private String eircode;
    private Integer sector;
}