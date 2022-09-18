package com.feather.assistant.Entity.member;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
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
}
