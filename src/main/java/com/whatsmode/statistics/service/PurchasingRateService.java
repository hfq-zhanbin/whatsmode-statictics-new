package com.whatsmode.statistics.service;

import com.whatsmode.statistics.entity.PurchasingRate;

public interface PurchasingRateService {

    PurchasingRate getDay1info(Long id);

    PurchasingRate getDay2info(Long id);

    PurchasingRate getDay3info(Long id);

    PurchasingRate getDay4info(Long id);

    PurchasingRate getDay5info(Long id);

}
