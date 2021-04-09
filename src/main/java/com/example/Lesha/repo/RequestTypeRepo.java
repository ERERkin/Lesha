package com.example.Lesha.repo;

import com.example.Lesha.entity.ahd.requestsTypes.RequestType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestTypeRepo extends JpaRepository<RequestType, Long> {
}
