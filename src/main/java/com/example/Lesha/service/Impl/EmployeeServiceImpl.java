package com.example.Lesha.service.Impl;

import com.example.Lesha.entity.ahd.Employee.Employee;
import com.example.Lesha.repo.EmployeeRepo;
import com.example.Lesha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee getById(Long id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee save(Employee item) {
        return employeeRepo.save(item);
    }

    @Override
    public void delete(Long id) {
        employeeRepo.deleteById(id);
    }
}
