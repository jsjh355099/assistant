package com.feather.assistant.tradeEquipmentLog;

import com.feather.assistant.$Entity.TeamLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface TradeEquipmentLogRepository extends JpaRepository<TeamLogEntity,Integer> {
    List<TeamLogEntity> findAll();
}

