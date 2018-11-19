package com.whatsmode.statistics.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stats_purchasing")
@Builder
@Data
public class PurchasingRate {

    @Id
    @Column(columnDefinition = "bigint(13)")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="date",length = 50)
    private String date;

    @Column(name="total_sku_quantity",length = 50)
    private Integer totalSkuQuantity;

    @Column(name="3day_instock_sku_quantity",length = 50)
    private Integer day3SkuInstockQuantity;

    @Column(name="3day_sku_quantity_rate",length = 50)
    private Double day3SkuQuantityRate;

    @Column(name="5day_instock_sku_quantity",length = 50)
    private Integer day5SkuInstockQuantity;

    @Column(name="5day_sku_quantity_rate",length = 50)
    private Double day5SkuQuantityRate;

    @Column(name="7day_instock_sku_quantity",length = 50)
    private Integer day7SkuInstockQuantity;

    @Column(name="7day_sku_quantity_rate",length = 50)
    private Double day7SkuQuantityRate;
}