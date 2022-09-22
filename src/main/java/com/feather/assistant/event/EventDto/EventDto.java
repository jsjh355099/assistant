package com.feather.assistant.event.EventDto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class EventDto {

    @Column(name = "id_event")
    private Integer id_event;

    @Column(name = "permission")
    private Integer permission;

    @Column(name = "name")
    private String name;

}
