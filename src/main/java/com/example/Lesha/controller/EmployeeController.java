package com.example.Lesha.controller;

import com.example.Lesha.entity.ahd.Employee.Employee;
import com.example.Lesha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/ahd/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    List<Employee> getAll() throws ParseException {
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    Employee getById(@PathVariable("id") Long id) throws ParseException {
        return employeeService.getById(id);
    }

    @PostMapping
    Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id){
        employeeService.delete(id);
    }
}
