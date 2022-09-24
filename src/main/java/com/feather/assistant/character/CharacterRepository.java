package com.feather.assistant.character;

import com.feather.assistant.$Entity.CharacterEntity;
import com.feather.assistant.$Entity.EquipmentEntity;
import com.feather.assistant.character.CharacterDto.CharacterDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {
    List<CharacterEntity> findAll();
}
