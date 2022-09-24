package com.feather.assistant.character;

import com.feather.assistant.character.CharacterDto.CharacterDto;
import com.feather.assistant.character.CharacterService.CharacterService;
import com.feather.assistant.$CommonFIle.AssistantApiResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/character")
public class CharacterController {
    @Autowired
    CharacterService characterService;

    @AssistantApiResponse
    @GetMapping("/ls")
    public List<CharacterDto> getAllCharacter() {
        return characterService.findAll();
    }

    @DeleteMapping("/d")
    public void deleteCharacter(@RequestParam("id_character") Integer id_character) {
        characterService.deleteById(id_character);
    }
}
