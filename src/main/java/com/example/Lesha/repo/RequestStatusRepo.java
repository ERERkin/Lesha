package com.example.Lesha.repo;

import com.example.Lesha.entity.ahd.requestsStatus.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestStatusRepo extends JpaRepository<RequestStatus, Long> {

}
