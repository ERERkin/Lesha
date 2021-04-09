package com.example.Lesha.service;

import com.example.Lesha.entity.ahd.requestsTypes.RequestType;

import java.util.List;

public interface RequestTypeService extends BaseService<RequestType>{
    @Override
    RequestType getById(Long id);

    @Override
    List<RequestType> getAll();

    @Override
    RequestType save(RequestType item);

    @Override
    void delete(Long id);
}
