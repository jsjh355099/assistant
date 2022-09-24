package com.feather.assistant.guild;

import com.feather.assistant.$Entity.GuildEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface GuildRepository extends JpaRepository<GuildEntity,Integer> {
    List<GuildEntity> findAll();
}
