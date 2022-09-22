package com.feather.assistant.character.CharacterDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "charactor")
public class CharacterDto {

    @Column(name = "name")
    private String name;

    @Column(name = "job")
    private String job;

}
