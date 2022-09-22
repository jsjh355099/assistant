package com.feather.assistant.account;

import com.feather.assistant.$Entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@EnableJpaRepositories
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {

    List<AccountEntity> findAll();

    List<AccountEntity> getByPermission(Integer permission);
    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "REPLACE feather.account(id_account,permission,name) VALUE(:id_account, :permission, :name);")

    void replaceById(@Param("id_account")Integer id_account,@Param("permission")Integer permission,@Param("name")String name);

}
