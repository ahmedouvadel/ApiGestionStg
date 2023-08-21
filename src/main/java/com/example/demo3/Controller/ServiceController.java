package com.example.demo3.Controller;

import com.example.demo3.Model.Service;
import com.example.demo3.Repository.ServiceRepository;
import com.example.demo3.service.Classes.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Service")
public class ServiceController {
    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    ServiceImp serviceImp;

    /**
     * endpoint: pour lister les Services
     * @return
     */
    @GetMapping
    public List<Service> getAllService() {
        return serviceImp.getAllService();
    }

    /**
     * endpoint: pour create les Services
     * @return
     */
    @PostMapping
    public Service createService(@RequestBody Service service){
        Service service1 = serviceImp.save(service);
        return  service1;
    }

    /**
     * endpoint: pour Lister les Service par Id
     * @return
     */
    @GetMapping("{id}")
    public ResponseEntity<Service> getServiceById(@PathVariable Long id) {
        Service service = serviceRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
        return  ResponseEntity.ok(service);
    }

    /**
     * endpoint: pour Modifiier les Service par Id
     * @return
     */
    @PutMapping("{id}")
    public ResponseEntity<Service> updateService(@PathVariable Long id,@RequestBody Service serviceDetails) {
        Service updateService = serviceRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

        serviceDetails.setNomservice(serviceDetails.getNomservice());
        serviceDetails.setNomdepartement(serviceDetails.getNomdepartement());

        serviceRepository.save(updateService);
        return ResponseEntity.ok(updateService);
    }

}
