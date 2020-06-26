//package com.gamll.api.bean;
//
//
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//
///**
// * @param
// * @return
// */
//public class PmsBaseCatalog1 implements Serializable {
//    @Id
//    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String id;
//    @Column
//    private String name;
//
//    @Transient
//    private List<BaseCatalog2> catalog2s;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
