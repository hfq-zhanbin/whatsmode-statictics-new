package com.whatsmode.statistics.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    /**
     * 前value天的日期
     * @param value 第几天（可以为负数）
     * @return 日期
     */
    public static String dateOfAfter(int value) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date= new Date();//取时间
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, value);

        return sdf.format(calendar.getTime());

    }
}
