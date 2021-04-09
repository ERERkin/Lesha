package com.example.Lesha.controller;

import com.example.Lesha.entity.ahd.WorkersDepartments.WorkersDepartment;
import com.example.Lesha.service.WorkersDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/ahd/workersDepartment")
public class WorkersDepartmentsController {
    @Autowired
    WorkersDepartmentService workersDepartmentService;

    @GetMapping
    List<WorkersDepartment> getAll() throws ParseException {
        return workersDepartmentService.getAll();
    }

    @GetMapping("/{id}")
    WorkersDepartment getById(@PathVariable("id") Long id) throws ParseException {
        return workersDepartmentService.getById(id);
    }

    @PostMapping
    WorkersDepartment save(@RequestBody WorkersDepartment workersDepartment){
        return workersDepartmentService.save(workersDepartment);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id){
        workersDepartmentService.delete(id);
    }
}
