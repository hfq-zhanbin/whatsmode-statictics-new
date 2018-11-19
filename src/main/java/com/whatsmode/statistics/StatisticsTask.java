package com.whatsmode.statistics;

import com.whatsmode.statistics.service.PurchasingRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class StatisticsTask {

    @Autowired
    private PurchasingRateService purchasingRateService;

    @Scheduled(cron = "0 10 08 * * *")
    public void task() {
        System.out.print("i am a task auto run !!");
        purchasingRateService.getDay1info(null);
        purchasingRateService.getDay2info(null);
        purchasingRateService.getDay3info(null);
        purchasingRateService.getDay4info(null);
        purchasingRateService.getDay5info(null);


    }
}
