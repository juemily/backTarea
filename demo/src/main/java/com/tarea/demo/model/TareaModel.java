package com.tarea.demo.model;

import lombok.Data;
import java.util.UUID;


@Data
public class TareaModel {


    private UUID id;
    private String title;
    private String description;

    public TareaModel() {
    }

    public TareaModel(String title, String description, UUID id) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

}
