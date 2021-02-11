package com.datecalender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {

    public static void main(String args[]) {
        // Instantiate a Date & calender object
        Date date = new Date();

        Calendar cal= Calendar.getInstance();


        // display time and date using toString()
        System.out.println(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(date));

        SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");

        System.out.println(sd.format(cal.getTime()));

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}
