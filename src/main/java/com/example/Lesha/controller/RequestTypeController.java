package com.example.Lesha.controller;

import com.example.Lesha.entity.ahd.requestsTypes.RequestType;
import com.example.Lesha.service.RequestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/ahd/requestType")
public class RequestTypeController {
    @Autowired
    RequestTypeService requestTypeService;

    @GetMapping
    List<RequestType> getAll() throws ParseException {
        return requestTypeService.getAll();
    }

    @GetMapping("/{id}/requestType")
    RequestType getById(@PathVariable("id") Long id) throws ParseException {
        return requestTypeService.getById(id);
    }

    @PostMapping
    RequestType save(@RequestBody RequestType requestType){
        return requestTypeService.save(requestType);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id){
        requestTypeService.delete(id);
    }
}
