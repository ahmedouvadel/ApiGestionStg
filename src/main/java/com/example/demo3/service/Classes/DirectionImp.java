package com.example.demo3.service.Classes;

import com.example.demo3.Model.Direction;
import com.example.demo3.Repository.DirectionRepository;
import com.example.demo3.service.Interfaces.IDirection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class DirectionImp implements IDirection {
    @Autowired
    private DirectionRepository directionRepository;
    @Override
    public List<Direction> getAllDirection() {
        return directionRepository.findAll();
    }
    @Override
    public Direction save(Direction direction) {
        return directionRepository.save(direction);
    }

    @Override
    public Direction getDirectionById(Long id) {
        return directionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
    }

    @Override
    public void updateDirection(Long id, Direction direction) {
        Direction direction1 = directionRepository.findById(id).get();

        direction1.setNomdirection(direction1.getNomdirection());

        directionRepository.save(direction1);
    }
    @Override
    public void deleteDirection(Long id) { directionRepository.deleteById(id);
    }
}
