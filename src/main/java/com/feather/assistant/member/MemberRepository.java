package com.feather.assistant.member;

import com.feather.assistant.$Entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@EnableJpaRepositories
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {

    List<MemberEntity> findAll();

    List<MemberEntity> getByPermission(Integer permission);
    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "REPLACE feather.member(id_member,permission,name) VALUE(:id_member, :permission, :name);")
//    void updateById(@Param("id_member")Integer id_member,@Param("permission")Integer permission,@Param("name")String name);
    void replaceById(@Param("id_member")Integer id_member,@Param("permission")Integer permission,@Param("name")String name);

}
