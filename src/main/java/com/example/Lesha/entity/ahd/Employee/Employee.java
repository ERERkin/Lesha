package com.example.Lesha.entity.ahd.Employee;


import com.example.Lesha.entity.ahd.WorkersDepartments.WorkersDepartment;
import com.example.Lesha.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Employees")
public class Employee extends BaseEntity {
    @NotNull
    @Column(nullable = false, name = "employeeName")
    private String employeeName;

    @NotNull
    @Column(nullable = false, name = "employeePhoneNumber")
    private String employeePhoneNumber;

    @NotNull
    @Column(nullable = false, name = "employeeEmail")
    private String employeeEmail;

//    @NotNull
//    @ManyToOne
//    @JoinColumn(name = "requestId")
//    private Requests requests;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "departmentId")
    private WorkersDepartment workersDepartment;
}
