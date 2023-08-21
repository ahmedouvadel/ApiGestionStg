package com.example.demo3.Repository;

import com.example.demo3.Model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    //All Command On Crud
}
