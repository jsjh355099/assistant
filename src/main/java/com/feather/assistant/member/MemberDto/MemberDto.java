package com.feather.assistant.member.MemberDto;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Vector;

@Entity
@Table(name = "member")
@SecondaryTables({@SecondaryTable(name = "account"),@SecondaryTable(name = "equipment")})
@Data
public class MemberDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_member")
    private Integer id_member;

    @Column(name = "permission")
    private String permission;

    @Column(name = "name")
    private String name;

    @OneToMany
    @JoinColumn(name = "name",table = "account")
    private Vector<String> accountVector;

    @JoinColumn(name = "id_equipment",table = "equipment")
    private ArrayList<Integer> equipmentList;
}
