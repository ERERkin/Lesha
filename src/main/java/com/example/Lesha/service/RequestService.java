package com.example.Lesha.service;

import com.example.Lesha.entity.ahd.Requests.Request;

import java.util.List;

public interface RequestService extends BaseService<Request>{
    @Override
    Request getById(Long id);

    @Override
    List<Request> getAll();

    List<Request> getAllyWorkersDepartmentId(Long id);

    @Override
    Request save(Request item);

    @Override
    void delete(Long id);
}
