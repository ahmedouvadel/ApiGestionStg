package com.example.demo3.service.Classes;

import com.example.demo3.Model.Stage;
import com.example.demo3.Repository.StageRepository;
import com.example.demo3.service.Interfaces.IStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StageImp implements IStage {
    @Autowired
    private StageRepository stageRepository;
    public List<Stage> getAllStage() {
       return stageRepository.findAll();
    }
    @Override
    public Stage save(Stage stage) {
        return stageRepository.save(stage);
    }

    @Override
    public Stage getStageById(Long id) {
        return stageRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not Found"));
    }
}
