package com.spring.pavel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Test test = context.getBean("test", Test.class);
        System.out.println(test.getName());
        context.close();
    }
}
