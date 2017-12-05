package main.java.core;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by asahi02 on 2017-12-05.
 */
public class HelloWorld {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The current local time is: " + dtf.format(now));

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
