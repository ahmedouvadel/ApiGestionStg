package com.example.demo3.service.Interfaces;

import com.example.demo3.Model.Stage;

import java.util.List;

public interface IStage {

    List<Stage> getAllStage();

    public Stage save(Stage stage);

    public Stage getStageById(Long id);
}
