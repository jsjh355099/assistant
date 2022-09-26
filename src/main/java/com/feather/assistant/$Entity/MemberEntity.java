package com.feather.assistant.$Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_member")
    private Integer id_member;

    @Column(name = "permission")
    private Integer permission;

    @Column(name = "name")
    private String name;


    @Column(name = "updated_time")
    private Timestamp updated_time = Timestamp.valueOf(LocalDateTime.now());

}
