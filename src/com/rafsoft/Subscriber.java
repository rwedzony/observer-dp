package com.rafsoft;

public class Subscriber implements Observer {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Hello, " + name + " Video Uploaded");
    }

}
