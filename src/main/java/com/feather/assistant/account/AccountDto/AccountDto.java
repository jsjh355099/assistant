package com.feather.assistant.account.AccountDto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class AccountDto {

    @Column(name = "id_account")
    private Integer id_account;

    @Column(name = "permission")
    private Integer permission;

    @Column(name = "name")
    private String name;

}
