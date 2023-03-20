package com.company;

import com.company.config.Config;
import com.company.controller.AuthController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Hotel {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AuthController authController = (AuthController) context.getBean("authController");
        authController.start();
    }
}
