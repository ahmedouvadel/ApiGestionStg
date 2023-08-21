package com.example.demo3.Controller;


import com.example.demo3.Model.Direction;
import com.example.demo3.Repository.DirectionRepository;
import com.example.demo3.service.Classes.DirectionImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Direction")
public class DirectionController {
    @Autowired
    private DirectionRepository directionRepository;
    @Autowired
    private DirectionImp directionImp;
    /**
     * endpoint: pour Lister les Direction par Id
     * @return
     */

    @GetMapping
    public List<Direction> getAllDirection() {
        return directionImp.getAllDirection();
    }

    /**
     * endpoint: pour cree les Directions
     * @return
     */
    @PostMapping
    public Direction CreateDirection(@RequestBody Direction direction) {
        Direction direction1 = directionImp.save(direction);
        return direction1;
    }

    /**
     * endpoint: pour Lister les Directions par Id
     * @return
     */

    @GetMapping("{id}")
    public Direction getDirectionById(@PathVariable Long id) {
        Direction direction = directionImp.getDirectionById(id);
        return direction;
    }

    /**
     * endpoint: pour Modifiier les Direction par Id
     * @return
     */

    @PutMapping("/{id}") // Use a proper URI pattern with curly braces
    public ResponseEntity<Direction> updateDirection(@PathVariable Long id, @RequestBody Direction direction) {
        Direction updatedDirection = directionImp.updateDirection(id, direction);
        return new ResponseEntity<>(updatedDirection, HttpStatus.OK);
    }


   /** @PutMapping("{id}")
    public ResponseEntity<Direction> updateDirection(@PathVariable Long id,@RequestBody Direction direction) {
       Direction updateDirection = directionImp.updateDirection(id , direction);
        return new ResponseEntity<>(updateDirection, HttpStatus.OK );
    } */

    /**
     * endpoint: pour Supprimer les Direction
     * @return
     */

    @DeleteMapping("{id}")
    public  void deleteDirection(@PathVariable Long id){
        directionImp.deleteDirection(id);
    }

}
