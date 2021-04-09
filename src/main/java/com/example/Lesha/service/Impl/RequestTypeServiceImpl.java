package com.example.Lesha.service.Impl;

import com.example.Lesha.entity.ahd.requestsTypes.RequestType;
import com.example.Lesha.repo.RequestTypeRepo;
import com.example.Lesha.service.RequestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequestTypeServiceImpl implements RequestTypeService {
    @Autowired
    RequestTypeRepo requestTypeRepo;

    @Override
    public RequestType getById(Long id) {
        return requestTypeRepo.findById(id).get();
    }

    @Override
    public List<RequestType> getAll() {
        return requestTypeRepo.findAll();
    }

    @Override
    public RequestType save(RequestType item) {
        return requestTypeRepo.save(item);
    }

    @Override
    public void delete(Long id) {
        requestTypeRepo.deleteById(id);
    }
}
