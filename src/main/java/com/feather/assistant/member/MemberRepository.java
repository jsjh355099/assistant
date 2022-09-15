package com.feather.assistant.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value =
                    "UPDATE feather.member " +
                    "SET permission = :permission ,name = :name " +
                    "WHERE  id_member = :id_member ;"
    )
    void updateById(@Param("id_member") Integer id_member, @Param("permission") Integer permission, @Param("name") String name);


    List<MemberEntity> getByPermission(Integer permission);
}
