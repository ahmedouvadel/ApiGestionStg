/** package com.example.demo3.Controller;
import com.example.demo3.Model.Stage;
import com.example.demo3.service.Interfaces.IStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/Stage")
public class StageController {
    @Autowired
    private IStage iStage;

    /**
     * endpoint: pour lister les Stages
     * @return


    @GetMapping
    public List<Stage> getAllStage( Long id) {
       return iStage.getAllStage();
    }

    /**
     * endpoint: pour Ajouter les Stages
     * @return



    @PostMapping
    public Stage createStage(@RequestBody Stage stage) {
        Stage stage1 = iStage.save(stage);
        return  stage1;
    }

    /**
     * endpoint: pour Lister les Stages Par Id
     * @return

    @GetMapping("{id}")
    public Stage getStageById(@PathVariable Long id){
        Stage stage = iStage.getStageById(id);
        return stage;
    }

    /**
     * endpoint: pour Modifier les Stages
     * @return

    @PutMapping("{id}")
    public ResponseEntity<Stage> updateStage(@PathVariable Long id,@RequestBody Stage stage){
        Stage updateStage = iStage.updateStage(id, stage);

        return new ResponseEntity<>(updateStage, HttpStatus.OK);

    }

    /**
     * endpoint: pour Supprimer les Stages
     * @return

    @DeleteMapping("{id}")
    public  void deleteStage(@PathVariable  Long id){
        iStage.deleteStage(id);
    }





} */
