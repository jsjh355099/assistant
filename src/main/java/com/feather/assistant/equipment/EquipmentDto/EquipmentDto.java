package com.feather.assistant.equipment.EquipmentDto;

import lombok.Data;

import javax.persistence.*;
@Data
@Table(name = "equipment")
public class EquipmentDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipment")
    private String id_equipment;

    @Column(name = "name")
    private Integer name;
}
