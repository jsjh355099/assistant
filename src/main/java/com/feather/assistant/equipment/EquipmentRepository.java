package com.feather.assistant.equipment;

import com.feather.assistant.$Entity.EquipmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface EquipmentRepository extends JpaRepository<EquipmentEntity,Integer> {
    List<EquipmentEntity> findAll();
}
