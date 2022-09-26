package com.feather.assistant.character.job;

import com.feather.assistant.$Entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface JobRepository extends JpaRepository<JobEntity, Integer> {
    List<JobEntity> findAll();
}
