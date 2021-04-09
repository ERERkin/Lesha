package com.example.Lesha.entity.ahd.requestsStatus;
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
@Table(name = "requestsStatus")
public class RequestStatus extends BaseEntity {
    @Column(nullable = false, name = "statusName")
    private String statusName;

}
