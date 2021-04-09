package com.example.Lesha.controller;

import com.example.Lesha.entity.ahd.requestsStatus.RequestStatus;
import com.example.Lesha.service.RequestStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/ahd/requestStatus")
public class RequestStatusController {
    @Autowired
    RequestStatusService requestStatusService;

    @GetMapping
    List<RequestStatus> getAll() throws ParseException {
        return requestStatusService.getAll();
    }

    @GetMapping("/{id}")
    RequestStatus getById(@PathVariable("id") Long id) throws ParseException {
        return requestStatusService.getById(id);
    }

    @PostMapping
    RequestStatus save(@RequestBody RequestStatus requestStatus){
        return requestStatusService.save(requestStatus);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id){
        requestStatusService.delete(id);
    }
}
