package com.company;

import java.util.*;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(){
        day=0;
        month=0;
        year=0;
    }
    public MyDate(int month, int day, int year){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setDay(int day){
        this.day=day;
    }
    public boolean equals(MyDate date){
        if(this.year==date.getYear() && this.month==date.getMonth() && this.day==date.getDay())
            return true;
        else return false;
    }
    public String toString(){
        return ""+month+"/"+day+"/"+year;
    }
}