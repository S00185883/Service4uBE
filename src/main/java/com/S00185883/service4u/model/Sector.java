package com.S00185883.service4u.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//package com.S00185883.service4u.model;
////
////
////
////import javax.persistence.Entity;
////import javax.persistence.Id;
////import javax.persistence.Table;
////
////
////@Entity
////@Table(name = "sector")
////public class Sector {
////
//    @Id
//    private String sectorId;
//    private String type;
//    private String description;
////
////}
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "sector")
//public class Sector {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long sectorId;
//    @Column(name = "type")
//    private String type;
//    @Column(name = "description")
//    private String description;
////    @OneToMany(mappedBy = "sector")
////    private Set<Provider> providers = new HashSet<>();
//    public Sector() {
//    }
//    public Sector(String type, String description) {
//        this.type = type;
//        this.description = description;
//    }
//    public long getId() {
//        return sectorId;
//    }
//    public String getType() {
//        return type;
//    }
//    public void setType(String type) {
//        this.type = type;
//    }
//    public String getDescription() {
//        return description;
//    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public String toString() {
//        return "Sector [id=" + sectorId + ", type=" + type + ", desc=" + description + "]";
//    }
//}
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// Class
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String sectorId;
    private String type;
    private String description;
}