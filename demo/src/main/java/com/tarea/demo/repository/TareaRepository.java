package com.tarea.demo.repository;

import com.tarea.demo.entity.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface TareaRepository extends JpaRepository<TareaEntity, UUID> {
}
