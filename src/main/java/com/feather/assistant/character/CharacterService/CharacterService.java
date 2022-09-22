package com.feather.assistant.character.CharacterService;

import com.feather.assistant.character.CharacterDto.CharacterDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface CharacterService extends JpaRepository<CharacterDto,Integer> {

    List<CharacterDto> findAll();
}
