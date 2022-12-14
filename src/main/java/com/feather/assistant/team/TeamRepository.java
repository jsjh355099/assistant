package com.feather.assistant.team;

import com.feather.assistant.$Entity.TeamLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface TeamRepository extends JpaRepository<TeamLogEntity,Integer> {
    List<TeamLogEntity> findAll();
}

