package com.example.demo3.Controller;

import com.example.demo3.Model.Stage;
import com.example.demo3.Repository.StageRepository;
import com.example.demo3.service.Classes.StageImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/Stage")
public class StageController {
    @Autowired
    StageImp stageImp;

    /**
     * endpoint: pour lister les Stages
     * @return
     */

    @GetMapping
    public List<Stage> getAllStage( Long id) {
       return stageImp.getAllStage();
    }

    /**
     * endpoint: pour Ajouter les Stages
     * @return
     */


    @PostMapping
    public Stage createStage(@RequestBody Stage stage) {
        Stage stage1 = stageImp.save(stage);
        return  stage1;
    }

    /**
     * endpoint: pour Lister les Stages Par Id
     * @return
     */
    @GetMapping("{id}")
    public Stage getStageById(@PathVariable Long id){
        Stage stage = stageImp.getStageById(id);
        return stage;
    }


}
