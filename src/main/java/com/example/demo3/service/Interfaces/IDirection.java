package com.example.demo3.service.Interfaces;

import com.example.demo3.Model.Direction;

import java.util.List;

public interface IDirection {

    public List<Direction> getAllDirection();

    public  Direction save(Direction direction);

    public Direction getDirectionById(Long id);

    public Direction updateDirection(Long id , Direction direction);

    public  void deleteDirection(Long id);
}
