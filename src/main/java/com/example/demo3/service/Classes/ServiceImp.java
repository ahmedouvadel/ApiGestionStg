package com.example.demo3.service.Classes;

import com.example.demo3.Model.Service;
import com.example.demo3.Repository.ServiceRepository;
import com.example.demo3.service.Interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceImp implements IService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<Service> getAllService() {
        return serviceRepository.findAll();
    }

    @Override
    public Service save(Service service) {
        return serviceRepository.save(service);
    }
}
