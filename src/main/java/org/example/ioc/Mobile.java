package org.example.ioc;

import org.example.ioc.sim.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Sim sim = context.getBean("sim", Sim.class);
        sim.call();
    }
}
