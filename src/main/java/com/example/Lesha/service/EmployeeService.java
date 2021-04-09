package com.example.Lesha.service;

import com.example.Lesha.entity.ahd.Employee.Employee;

import java.util.List;

public interface EmployeeService extends BaseService<Employee>{
    @Override
    Employee getById(Long id);

    @Override
    List<Employee> getAll();

    @Override
    Employee save(Employee item);

    @Override
    void delete(Long id);
}
