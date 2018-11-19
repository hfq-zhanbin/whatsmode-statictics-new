package com.whatsmode.statistics.service;

import org.springframework.stereotype.Service;

@Service
public class PurchaseRateServiceImpl implements PurchaseRateService {
    /**
     * 某一天下的订单量
     * @param date 下订单日期（yyyy-MM-dd）
     * @return 下订单总量
     */
    @Override
    public int getByOrderTimeEquals(String date) {
        return 0;
    }

    /**
     * 下订单后X天内的总到货量
     * @param lastDate 下订单后的第X天的日期
     * @param orderDate 下订单日期
     * @return 到货总量(int)
     */
    @Override
    public int getAllBySku(String lastDate, String orderDate) {
        return 0;
    }
}
