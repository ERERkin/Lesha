package com.example.Lesha.service.Impl;

import com.example.Lesha.entity.ahd.WorkersDepartments.WorkersDepartment;
import com.example.Lesha.repo.WorkersDepartmentRepo;
import com.example.Lesha.service.WorkersDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkersDepartmentServiceImpl implements WorkersDepartmentService {
    @Autowired
    WorkersDepartmentRepo workersDepartmentRepo;

    @Override
    public WorkersDepartment getById(Long id) {
        return workersDepartmentRepo.findById(id).get();
    }

    @Override
    public List<WorkersDepartment> getAll() {
        return workersDepartmentRepo.findAll();
    }

    @Override
    public WorkersDepartment save(WorkersDepartment item) {
        return workersDepartmentRepo.save(item);
    }

    @Override
    public void delete(Long id) {
        workersDepartmentRepo.deleteById(id);
    }
}
