package com.tarea.demo.service.imp;

import com.tarea.demo.entity.TareaEntity;
import com.tarea.demo.model.TareaModel;
import com.tarea.demo.repository.TareaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class TareaServiceImpTest {


    @Mock
    TareaRepository repository;
    @InjectMocks
    TareaServiceImp tareaServiceImp;


    TareaModel dto = new TareaModel();
    List <TareaModel> dtoList = new ArrayList<>();
    TareaEntity entity = new TareaEntity();

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);
        tareaServiceImp = new TareaServiceImp();

    }



    @Test
    void save() {

        entity.setId(UUID.fromString("eedfe822-86e0-4c43-93f6-7e6b67c24131"));
        entity.setTitle("saludo");
        entity.setDescription("say Hi!");
        dto.setTitle("saludo");
        dto.setDescription("aloha!");
        dtoList.add(dto);

        Mockito.when(repository.save(Mockito.any(TareaEntity.class)))
                .thenAnswer(i -> i.getArguments()[0]);
       //TODO falla al momento de llamar el repositorio
        // Mockito.when(tareaServiceImp.save(dto)).thenReturn(dtoList);
       //List<TareaModel> response = tareaServiceImp.save(dto);
       //assert (response.contains(dto));


    }

    @Test
    void detele() {
        //TODO
    }

    @Test
    void findAll() {

        //TODO
    }
}