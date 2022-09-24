package com.feather.assistant.account;

import com.feather.assistant.$Entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import java.util.List;

@EnableJpaRepositories
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
    List<AccountEntity> findAll();

}
