package org.example.ioc.sim;

public class Jio implements Sim{
    @Override
    public void call() {
        System.out.printf("calling from jio");
    }

    @Override
    public void sms() {
        System.out.printf("SmS from jio");
    }
}
