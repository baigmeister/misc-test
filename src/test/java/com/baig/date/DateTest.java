package com.baig.date;

import org.junit.Test;

import java.util.Calendar;

public class DateTest {

    @Test
    public void testDateOutput() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 3-1, 4);

        int day = calendar.get(Calendar.DAY_OF_WEEK);

        String dayOfWeek = "";
        switch(day){
            case 1: dayOfWeek = "sunday";  break;
            case 2: dayOfWeek = "monday"; break;
            case 3 : dayOfWeek = "tuesday"; break;
            case 4 : dayOfWeek = "wednesday"; break;
            case 5 : dayOfWeek = "thursday"; break;
            case 6: dayOfWeek = "friday"; break;
            default: dayOfWeek =  "saturday";
        }
        System.out.print(dayOfWeek.toUpperCase());

    }
}
