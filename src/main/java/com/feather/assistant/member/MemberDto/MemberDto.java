package com.feather.assistant.member.MemberDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
@Data
public class MemberDto {

    @Column(name = "id_member")
    private Integer id_member;

    @Column(name = "permission")
    private Integer permission;

    @Column(name = "name")
    private String name;

}
