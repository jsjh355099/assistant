package com.feather.assistant.charactor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "charactor")
public class CharactorEntity {

    int id_charactor;

    String name;

    String job;


}
