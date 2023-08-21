package com.example.demo3.Repository;

import com.example.demo3.Model.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionRepository extends JpaRepository<Direction, Long> {
    //All Command On Crud
}
