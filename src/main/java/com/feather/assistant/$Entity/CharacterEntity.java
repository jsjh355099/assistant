package com.feather.assistant.$Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "character")
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_character")
    private int id_charactor;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "id_account")
    private String id_account;

    @Column(name = "name")
    private String name;

    @Column(name = "job")
    private String job;

    @Column(name = "base_lv")
    private Integer base_lv;

    @Column(name = "updated_time")
    private Timestamp updated_time ;

}
