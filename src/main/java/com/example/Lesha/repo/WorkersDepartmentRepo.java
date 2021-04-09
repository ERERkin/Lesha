package com.example.Lesha.repo;

import com.example.Lesha.entity.ahd.WorkersDepartments.WorkersDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkersDepartmentRepo extends JpaRepository<WorkersDepartment, Long> {
}
