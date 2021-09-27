package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
    MyDate date1= new MyDate(28,9,2021);
    MyDate date2= new MyDate(6,3,1994);

    System.out.println("Date1: "+ date1.getMonth()+"."+date1.getDay() + "." +date1.getYear());
    System.out.println("Date2: "+date2.getMonth()+"."+date2.getDay()+"."+date2.getYear());

    }
}
