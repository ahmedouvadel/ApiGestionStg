package com.example.demo3.Controller;
import com.example.demo3.Model.Service;
import com.example.demo3.service.Interfaces.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Service")
public class ServiceController {
    @Autowired
    private IService iService;

    /**
     * endpoint: pour lister les Services
     * @return
     */
    @GetMapping
    public List<Service> getAllService() {
        return iService.getAllService();
    }

    /**
     * endpoint: pour create les Services
     * @return
     */
    @PostMapping
    public Service createService(@RequestBody Service service){
        Service service1 = iService.save(service);
        return  service1;
    }

    /**
     * endpoint: pour Lister les Service par Id
     * @return
     */
    @GetMapping("{id}")
    public Service getServiceById(@PathVariable Long id) {
        Service service = iService.getServiceById(id);
        return  service;
    }

    /**
     * endpoint: pour Modifiier les Service par Id
     * @return
     */
    @PutMapping("{id}")
    public ResponseEntity<Service> updateService(@PathVariable Long id,@RequestBody Service service){
        Service updateService = iService.updateService(id, service);

        return new ResponseEntity<>(updateService,HttpStatus.OK);
    }

    /**
     * endpoint: pour Supprimer les Service
     * @return
     */
    @DeleteMapping("{id}")
    public void deleteService(@PathVariable Long id){
        iService.deleteService(id);
    }


}
