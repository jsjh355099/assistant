package com.feather.assistant.$Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "team")
public class TeamLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_team")
    private Integer id_team;
    @Column(name = "name")
    private String name;
    @Column(name = "id_event")
    private Integer id_event;
    @Column(name = "member_charactor_0")
    private Integer member_charactor_0;
    @Column(name = "member_charactor_1")
    private Integer member_charactor_1;
    @Column(name = "member_charactor_2")
    private Integer member_charactor_2;
    @Column(name = "member_charactor_3")
    private Integer member_charactor_3;
    @Column(name = "member_charactor_4")
    private Integer member_charactor_4;
    @Column(name = "member_charactor_5")
    private Integer member_charactor_5;
    @Column(name = "member_charactor_6")
    private Integer member_charactor_6;
    @Column(name = "member_charactor_7")
    private Integer member_charactor_7;
    @Column(name = "member_charactor_8")
    private Integer member_charactor_8;
    @Column(name = "member_charactor_9")
    private Integer member_charactor_9;
    @Column(name = "member_charactor_10")
    private Integer member_charactor_10;
    @Column(name = "member_charactor_11")
    private Integer member_charactor_11;

}
