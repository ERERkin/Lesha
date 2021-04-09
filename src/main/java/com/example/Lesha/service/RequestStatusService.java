package com.example.Lesha.service;

import com.example.Lesha.entity.ahd.requestsStatus.RequestStatus;

import java.util.List;

public interface RequestStatusService extends BaseService<RequestStatus> {
    @Override
    RequestStatus getById(Long id);

    @Override
    List<RequestStatus> getAll();

    @Override
    RequestStatus save(RequestStatus item);

    @Override
    void delete(Long id);
}
