/** package com.example.demo3.service.Classes;

import com.example.demo3.Model.Stage;
import com.example.demo3.Repository.StageRepository;
import com.example.demo3.service.Interfaces.IStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StageImp implements IStage {
    @Autowired
    private StageRepository stageRepository;


     * endpoint: Methode pour Lister les Stages
     * @return

    public List<Stage> getAllStage() {
       return stageRepository.findAll();
    }

    /**
     * endpoint: Methode pour Create les Stages
     * @return

    @Override
    public Stage save(Stage stage) {
        return stageRepository.save(stage);
    }

    /**
     * endpoint: Methode pour Lister les Stages par Id
     * @return


    @Override
    public Stage getStageById(Long id) {
        return stageRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not Found"));
    }

    /**
     * endpoint: Methode pour Modifier les Stages
     * @return

    @Override
    public Stage updateStage(Long id, Stage stage) {
        Stage existingStage = stageRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Not fund"));

        existingStage.setDatedeb(stage.getDatedeb());
        existingStage.setDatefin(stage.getDatefin());
        existingStage.setNbadge(stage.getNbadge());

        return stageRepository.save(existingStage);
    }

    /**
     * endpoint: Methode pour Supprimer les Stages
     * @return


    @Override
    public void deleteStage(Long id) {
        stageRepository.deleteById(id);
    }
}   */
