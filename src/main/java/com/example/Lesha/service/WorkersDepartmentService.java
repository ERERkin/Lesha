package com.example.Lesha.service;

import com.example.Lesha.entity.ahd.WorkersDepartments.WorkersDepartment;

import java.util.List;

public interface WorkersDepartmentService extends BaseService<WorkersDepartment>{
    @Override
    WorkersDepartment getById(Long id);

    @Override
    List<WorkersDepartment> getAll();

    @Override
    WorkersDepartment save(WorkersDepartment item);

    @Override
    void delete(Long id);
}
