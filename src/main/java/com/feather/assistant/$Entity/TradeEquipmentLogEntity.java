package com.feather.assistant.$Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Vector;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "trade_equipment_log")
public class TradeEquipmentLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trade_equipment_log")
    private Integer id_trade_equipment_log;

    @Column(name = "transaction_time")
    private Timestamp transaction_time;

    @Column(name = "pictrue_file")
    private String pictrue_file;

    @Column(name = "charater_0")
    private Integer charater_0;

    @Column(name = "charater_1")
    private Integer charater_1;

    @Column(name = "charater_0_eqs")
    private Vector<Integer> charater_0_eqs;

    @Column(name = "charater_1_eqs")
    private Vector<Integer> charater_1_eqs ;

}
