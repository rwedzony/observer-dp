package com.rafsoft;


import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Channel channel = new Channel();
        Subscriber s1 = new Subscriber("Tom");
        Subscriber s2 = new Subscriber("Ann");
        Subscriber s3 = new Subscriber("Kyle");
        Subscriber s4 = new Subscriber("Kiran");
        Subscriber s5 = new Subscriber("Darren");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.subscribe(s4);
        channel.subscribe(s5);

        System.out.println("------------------------------------------------");
        channel.upload("How to solder simple electronic components?");


        System.out.println("------------------------------------------------");
        channel.unsubscribe(s1);
        channel.unsubscribe(s2);

        channel.upload("Java design patterns");




    }
}
