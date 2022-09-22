package com.feather.assistant.$Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private Integer id_account;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "id_member")
    private Boolean id_member;

    @Column(name = "comments")
    private Boolean comments;// 此為方便分辨帳號使用，請勿填入真實帳號。

}
