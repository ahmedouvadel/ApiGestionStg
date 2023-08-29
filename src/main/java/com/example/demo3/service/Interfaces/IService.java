package com.example.demo3.service.Interfaces;

import com.example.demo3.Model.Departement;
import com.example.demo3.Model.Service;

import java.util.List;

public interface IService {

    public List<Service> getAllService ();

    public Service save(Service service);

    public Service updateService(Long id, Service service);

    public  void deleteService(Long id);

    Service getServiceById(Long id);
}
