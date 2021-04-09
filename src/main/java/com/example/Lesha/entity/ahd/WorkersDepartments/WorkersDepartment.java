package com.example.Lesha.entity.ahd.WorkersDepartments;

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
@Table(name = "workersDepartments")
public class WorkersDepartment extends BaseEntity {

    @NotNull
    @Column(nullable = false, name = "departmentName")
    private String departmentName;

}
