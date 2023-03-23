package com.company;

import com.company.config.Config;
import com.company.controller.AuthController;
import com.company.entity.EmployeeEntity;
import com.company.enums.EmployeeStatus;
import com.company.enums.EmployeeType;
import com.company.repository.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class Hotel {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AuthController authController = (AuthController) context.getBean("authController");
//        EmployeeRepository employeeRepository = (EmployeeRepository) context.getBean("employeeRepository");
//        EmployeeEntity employee = new EmployeeEntity();
//        employee.setName("Xurshid");
//        employee.setSurName("Dusmatov");
//        employee.setBirthDate(LocalDate.parse("2003-12-01"));
//        employee.setStatus(EmployeeStatus.ACTIVE);
//        employee.setPhoneNumber("900");
//        employee.setType(EmployeeType.ADMIN);
//        employeeRepository.save(employee)
        authController.start();

    }
}
