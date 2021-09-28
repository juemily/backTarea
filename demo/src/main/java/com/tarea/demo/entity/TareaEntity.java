package com.tarea.demo.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class TareaEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "title")
    @NonNull
    private String title;

    @Column(name = "decription")
    @NonNull
    private String Description;

    public TareaEntity() {
    }

    public TareaEntity(UUID id, String title, String description) {
        this.id = id;
        this.title = title;
        Description = description;
    }
}
