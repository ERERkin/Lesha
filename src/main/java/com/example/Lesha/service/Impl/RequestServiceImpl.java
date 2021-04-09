package com.example.Lesha.service.Impl;

import com.example.Lesha.entity.ahd.Requests.Request;
import com.example.Lesha.entity.ahd.WorkersDepartments.WorkersDepartment;
import com.example.Lesha.repo.RequestRepo;
import com.example.Lesha.service.RequestService;
import com.example.Lesha.service.WorkersDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    RequestRepo requestRepo;
    @Autowired
    WorkersDepartmentService workersDepartmentService;

    @Override
    public Request getById(Long id) {
        return requestRepo.findById(id).get();
    }

    @Override
    public List<Request> getAll() {
        return requestRepo.findAll();
    }

    @Override
    public List<Request> getAllyWorkersDepartmentId(Long id) {
        List<Request> requests = requestRepo.findAll();
        List<Request> answer = requests.stream()
                .filter(s->s.getWorkersDepartment().getId() == id)
                .collect(Collectors.toList());
        return answer;
    }

    @Override
    public Request save(Request item) {
        if(item.getWorkersDepartment() == null){
            return requestRepo.save(item);
        }
        Request r = requestRepo.findById(item.getId()).get();
        WorkersDepartment wd = workersDepartmentService.getById(item.getWorkersDepartment().getId());
        r.setWorkersDepartment(wd);
        return requestRepo.save(r);
    }

    @Override
    public void delete(Long id) {
        requestRepo.deleteById(id);
    }
}
