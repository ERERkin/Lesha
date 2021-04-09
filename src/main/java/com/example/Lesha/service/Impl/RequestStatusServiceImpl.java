package com.example.Lesha.service.Impl;

import com.example.Lesha.entity.ahd.requestsStatus.RequestStatus;
import com.example.Lesha.repo.RequestStatusRepo;
import com.example.Lesha.service.RequestStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequestStatusServiceImpl implements RequestStatusService {
    @Autowired
    RequestStatusRepo requestStatusRepo;

    @Override
    public RequestStatus getById(Long id) {
        return requestStatusRepo.findById(id).get();
    }

    @Override
    public List<RequestStatus> getAll() {
        return requestStatusRepo.findAll();
    }

    @Override
    public RequestStatus save(RequestStatus item) {
        return requestStatusRepo.save(item);
    }

    @Override
    public void delete(Long id) {
        requestStatusRepo.deleteById(id);
    }
}
