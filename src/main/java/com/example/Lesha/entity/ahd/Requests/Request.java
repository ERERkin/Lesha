package com.example.Lesha.entity.ahd.Requests;


import com.example.Lesha.entity.ahd.Employee.Employee;
import com.example.Lesha.entity.ahd.WorkersDepartments.WorkersDepartment;
import com.example.Lesha.entity.ahd.requestsStatus.RequestStatus;
import com.example.Lesha.entity.ahd.requestsTypes.RequestType;
import com.example.Lesha.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Requests")
public class Request extends BaseEntity {

    @NotNull
    @Column(nullable = false, name = "requestNumber")
    private String requestNumber;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "requestType")
    private RequestType requestsType;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "responsiblePerson")
    private Employee responsiblePerson;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employeeId;


    @ManyToOne
    @JoinColumn(name = "departmentId")
    private WorkersDepartment workersDepartment;

    @NotNull
    @Lob
    @Column(nullable = false, name = "requestContent")
    private String requestContent;

    @NotNull
    @Column(nullable = false, name = "requestRegistrationDate")
    private Timestamp requestRegistrationDate;

    @Column(name = "requestIsAccepted")
    private boolean requestIsAccepted;

    @Column(name = "requestIsDeny")
    private boolean requestIsDeny;

    @Column(name = "requestIsReady")
    private boolean requestIsReady;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "requestStatus")
    private RequestStatus requestsStatus;

}
