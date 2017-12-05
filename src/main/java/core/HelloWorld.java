package main.java.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.joda.time.LocalTime;

/**
 * Created by asahi02 on 2017-12-05.
 */
public class HelloWorld {
    public static void main(String[] args) {
        // this is native library
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("The current local time is: " + dtf.format(now));

        // this is using external library
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
