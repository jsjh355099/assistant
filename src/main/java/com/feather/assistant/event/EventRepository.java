package com.feather.assistant.event;

import com.feather.assistant.$Entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@EnableJpaRepositories
public interface EventRepository extends JpaRepository<EventEntity, Integer> {

    List<EventEntity> findAll();

    List<EventEntity> getByPermission(Integer permission);
    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "REPLACE feather.event(id_event,permission,name) VALUE(:id_event, :permission, :name);")
//    void updateById(@Param("id_event")Integer id_event,@Param("permission")Integer permission,@Param("name")String name);
    void replaceById(@Param("id_event")Integer id_event,@Param("permission")Integer permission,@Param("name")String name);

}
