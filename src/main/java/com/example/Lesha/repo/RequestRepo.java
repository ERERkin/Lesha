package com.example.Lesha.repo;

import com.example.Lesha.entity.ahd.Requests.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepo extends JpaRepository<Request, Long> {
    @Query("select req from Request req where req.workersDepartment.id = :workersDepartmentId")
    List<Request> findAllByWorkersDepartmentId(Long workersDepartmentId);
//    List<Request> findAllByWorkersDepartmentId(Long id);
}
