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

    /**
     * endpoint: Methode pour Lister les Directions
     * @return
     */
    @Override
    public List<Direction> getAllDirection() {
        return directionRepository.findAll();
    }

    /**
     * endpoint: Methode pour Create les Services
     * @return
     */
    @Override
    public Direction save(Direction direction) {
        return directionRepository.save(direction);
    }

    /**
     * endpoint: Methode pour Lister les Directions par Id
     * @return
     */

    @Override
    public Direction getDirectionById(Long id) {
        return directionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
    }

    /**
     * endpoint: Methode pour Modifier les Direction
     * @return
     */
    @Override
    public Direction updateDirection(Long id, Direction direction) {
        Direction existingDirection = directionRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Fund"));

        existingDirection.setNomdirection(direction.getNomdirection()); // Update the field

        return directionRepository.save(existingDirection); // Save and return the updated entity
    }

   /** @Override
    public void updateDirection(Long id, Direction direction) {
        Direction updateDirection = directionRepository.findById(id).get();

        updateDirection.setNomdirection(updateDirection.getNomdirection());

        directionRepository.save(updateDirection);
    } */

    /**
     * endpoint: Methode pour Supprimer les Direction
     * @return
     */

    @Override
    public void deleteDirection(Long id) { directionRepository.deleteById(id);
    }
}
