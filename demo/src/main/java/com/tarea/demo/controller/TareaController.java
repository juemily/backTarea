package com.tarea.demo.controller;

import com.tarea.demo.model.TareaModel;
import com.tarea.demo.service.imp.TareaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarea/")
public class TareaController {

    @Autowired
    private TareaServiceImp service ;

    @DeleteMapping("delete/{id}")
    @ResponseStatus (code = HttpStatus.OK)
    public List<TareaModel> deleteTarea(@PathVariable(value = "id", required = true) String tareaId){
        return service.detele(tareaId);
    }


    @PostMapping("insert")
    @ResponseStatus(code = HttpStatus.CREATED)
    public List<TareaModel> insertOrUpdate(@RequestBody final TareaModel tarea){
        return service.save(tarea);
    }
    @PostMapping("update/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public List<TareaModel> update(@RequestBody final TareaModel tarea,
                                   @PathVariable(value = "id", required = true) String tareaId){
        return service.save(tarea);
    }

    @GetMapping("listAll")
    @ResponseStatus(code = HttpStatus.OK)
    public  List<TareaModel>findAll (){
        return service.findAll();
    }

}
