package com.feather.assistant.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@Table(name = "member")
public class MemberEntity {
    @Id
    @Generated
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_member")
    private Integer id_member;
    @Column(name = "permission")
    private Integer permission;
    @Column(name = "name")
    private String name;
}
