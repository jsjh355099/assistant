package com.feather.assistant.character.CharacterDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "charactor")
public class CharacterDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_character")
    private int id_charactor;

    @Column(name = "name")
    private String name;

    @Column(name = "job")
    private String job;

}
