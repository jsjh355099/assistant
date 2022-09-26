package com.feather.assistant.character;

import com.feather.assistant.$Entity.JobEntity;
import com.feather.assistant.character.CharacterDto.CharacterDto;
import com.feather.assistant.character.CharacterService.CharacterService;
import com.feather.assistant.$CommonFIle.AssistantApiResponse;

import com.feather.assistant.character.job.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {
    @Autowired
    CharacterService characterService;
    @Autowired
    JobRepository jobRepository;

    @AssistantApiResponse
    @GetMapping("/ls")
    List<CharacterDto> getAllCharacter() {
        return characterService.findAll();
    }

    @DeleteMapping("/rm")
    void deleteCharacter(@RequestParam("id_character") Integer id_character) {
        characterService.deleteById(id_character);
    }

    @GetMapping("/ls-j")
    List<JobEntity> getAllJob(){return jobRepository.findAll();}

}
