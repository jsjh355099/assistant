package com.feather.assistant.$Entity;

import lombok.Data;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Vector;

@Entity
@Data
@Table(name = "trade_equipment_log")
public class TradeEquipmentLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trade_equipment_log")
    private String id_trade_equipment_log;

    @Column(name = "charater_0")
    private Integer charater_0;

    @Column(name = "charater_1")
    private Integer charater_1;

    @Column(name = "transaction_time")
    private Timestamp transaction_time;

    @Column(name = "pictrue_file")
    private String pictrue_file;

    @Column(name = "charater_0_eqs")
    private String charater_0_eqs;

    @Column(name = "charater_1_eqs")
    private String charater_1_eqs;

    @OneToMany
    private Vector<String> charater_0_eqs_vector;

    @OneToMany
    private Vector<String> charater_1_eqs_vector;

}
