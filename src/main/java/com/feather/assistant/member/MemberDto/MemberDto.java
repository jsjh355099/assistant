package com.feather.assistant.member.MemberDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Data
public class MemberDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_member")
    private Integer id_member;

    @Column(name = "permission")
    private Integer permission;

    @Column(name = "name")
    private String name;

}
