package com.tarea.demo.service.imp;

import com.tarea.demo.entity.TareaEntity;
import com.tarea.demo.model.TareaModel;
import com.tarea.demo.repository.TareaRepository;
import com.tarea.demo.service.TareaService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TareaServiceImp implements TareaService {

    @Autowired
    TareaRepository repository;

    @Override
    @SneakyThrows
    public List<TareaModel> save(TareaModel tarea) {
        TareaEntity insert = new TareaEntity();
        insert.setTitle(tarea.getTitle());
        insert.setDescription(tarea.getDescription());

        if (tarea.getId() != null){
            insert.setId(tarea.getId());
        }
        repository.save(insert);
        return  findAll();
    }

    @Override
    public List<TareaModel> detele(String tareaId) {
        UUID uid = UUID.fromString(tareaId);
        repository.deleteAllById(Collections.singleton(uid));
        return findAll();
    }

    @Override
    public List<TareaModel> findAll() {
        List<TareaEntity> listEntity = repository.findAll();
        return  listEntity.stream().map(temp -> {
            TareaModel obj = new TareaModel();
            obj.setTitle(temp.getTitle());
            obj.setDescription(temp.getDescription());
            obj.setId(temp.getId());
            return obj;
        }).collect(Collectors.toList());
    }


}
