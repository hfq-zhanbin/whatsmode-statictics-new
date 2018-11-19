package com.whatsmode.statistics.service;

public interface PurchaseRateService {
    int getByOrderTimeEquals(String day);

    int getAllBySku(String lastDate,String orderDate);

}
