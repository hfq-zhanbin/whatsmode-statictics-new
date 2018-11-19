package com.whatsmode.statistics.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mb_purchasing_statement")
@Builder
@Data
public class PurchasingStatement {
    @Id
    @Column(columnDefinition = "bigint(13)")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Order_time",length = 150)
    private String Ordertime;

    @Column(name="Last_storage_time",length = 150)
    private String Laststoragetime;

    @Column(name="purchase_order_number",length = 100)
    private String Purchaseordernumber;

    @Column(length = 150)
    private String Supplier;

    @Column(name="product_name",length = 150)
    private String Productname;

    @Column(name="sku",length = 150)
    private String Sku;

    @Column(name="purchase_price",length = 100)
    private Integer Purchaseprice;

    @Column(name="quantity_purchase",length = 150)
    private Integer Quantitypurchase;

    @Column(name="quantity_storage",length = 150)
    private Integer Quantitystorage;

    @Column(name="quantity_loss",length = 150)
    private Integer Quantityloss;

    @Column(length = 100)
    private String Purchaser;
}
