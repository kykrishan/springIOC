package org.example.ioc.sim;

public class Airtel implements Sim{
    @Override
    public void call() {
        System.out.printf("calling from airtel");
    }

    @Override
    public void sms() {
        System.out.printf("sms from airtel");
    }
}
