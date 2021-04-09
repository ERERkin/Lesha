package com.example.Lesha.controller;

import com.example.Lesha.entity.ahd.Requests.Request;
import com.example.Lesha.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/ahd/request")
public class RequestController {
    @Autowired
    RequestService requestService;

    @GetMapping
    List<Request> getAll() throws ParseException {
        return requestService.getAll();
    }

    @GetMapping("/{id}")
    Request getById(@PathVariable("id") Long id) throws ParseException {
        Request r = requestService.getById(id);
        return requestService.getById(id);
    }

    @GetMapping("/wd/{id}")
    List<Request> getAllByWorkersDepartmentId(@PathVariable("id") Long id) throws ParseException {
        return requestService.getAllyWorkersDepartmentId(id);
    }

    @PostMapping
    Request save(@RequestBody Request workersDepartment){
        return requestService.save(workersDepartment);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id){
        requestService.delete(id);
    }

}
