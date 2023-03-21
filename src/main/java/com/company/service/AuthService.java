package com.company.service;

import com.company.container.ComponentContainer;
import com.company.dto.EmployeeDTO;
import com.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void login(String phoneNumber) {
        EmployeeDTO employee = employeeRepository.getEmployeeByPhone(phoneNumber);
        if (employee == null) {
            System.out.println("Phone incorrect");
            return;
        }

//        if (employee.get) {
//            System.out.println("You not allowed.MF");
//            return;
//        }

        ComponentContainer.employee = employee;
        if (employee.getRole().equals("ADMIN")) {
            adminController.start();
        } else {
            profileController.start();
        }

    }
}
