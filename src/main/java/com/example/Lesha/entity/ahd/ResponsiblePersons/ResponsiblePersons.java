package com.example.Lesha.entity.ahd.ResponsiblePersons;//package kg.kstu.ais.ahd.entity.ahd.ResponsiblePersons;
//
//import kg.kstu.ais.ahd.entity.ahd.Requests.Requests;
//import kg.kstu.ais.ahd.entity.ahd.Structure.Structure;
//import kg.kstu.ais.ahd.entity.base.BaseEntity;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//
//@Entity
//@Table(name = "responsiblePersons")
//
//
//public class ResponsiblePersons extends BaseEntity {
//
//    @NotNull
//    @Column(nullable = false, name = "responsiblePersonName")
//    private String responsiblePersonName;
//
//    @NotNull
//    @Column(nullable = false, name = "responsiblePersonPhoneNumber")
//    private String responsiblePersonPhoneNumber;
//
//    @NotNull
//    @Column(nullable = false, name = "responsiblePersonEmail")
//    private String responsiblePersonEmail;
//
//    @NotNull
//    @ManyToOne
//    @JoinColumn(name = "responsiblePersonStructureId")
//    private Structure structure;
//
//    @NotNull
//    @ManyToOne
//    @JoinColumn(name = "responsiblePersonRequest")
//    private Requests requests;
//
//}
