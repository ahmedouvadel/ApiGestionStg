package com.example.demo3.service.Classes;

import com.example.demo3.Model.Direction;
import com.example.demo3.Model.Service;
import com.example.demo3.Repository.ServiceRepository;
import com.example.demo3.service.Interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

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

    @Override
    public Service getServiceById(Long id) {
        return serviceRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
    }

    @Override
    public Service updateService(Long id, Service service) {
        Service existingService = serviceRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Not fund"));

        existingService.setNomservice(service.getNomservice());

        return serviceRepository.save(existingService);
    }
    @Override
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}
