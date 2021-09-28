package com.tarea.demo.service;

import com.tarea.demo.model.TareaModel;
import com.tarea.demo.service.imp.TareaServiceImp;

import java.util.List;

public interface TareaService {

    List<TareaModel> save( TareaModel tarea);
    List<TareaModel> detele (String tareaId);
    List<TareaModel> findAll();
}
