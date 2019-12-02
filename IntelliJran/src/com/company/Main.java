package com.company;

import org.joda.time.DateTime;
import org.joda.time.Duration;
public class Main {

    public static void main(String[] args) {
        DateTime now = DateTime.now();
        for (int i=1; i<=10;i++){
            System.out.println(i);
        }
        DateTime other = DateTime.now();
        Duration duration = new Duration(now, other);
        System.out.println(duration);
        System.out.println("Short difference of time, just to demonstrate.");
    }
}