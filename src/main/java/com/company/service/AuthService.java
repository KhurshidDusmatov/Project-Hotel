package com.company.service;

import com.company.container.ComponentContainer;
import com.company.controller.AdminController;
import com.company.dto.EmployeeDTO;
import com.company.entity.EmployeeEntity;
import com.company.enums.EmployeeStatus;
import com.company.enums.EmployeeType;
import com.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AdminController adminController;
    public void login(String phoneNumber) {
        EmployeeEntity employee = employeeRepository.getEmployeeByPhone(phoneNumber);
        if (employee == null) {
            System.out.println("Phone incorrect");
            return;
        }else if (employee.getStatus().equals(EmployeeStatus.NON_ACTIVE)){
            System.out.println("Your status non active");
            return;
        }
        ComponentContainer.employee = employee;
        if (employee.getType().equals(EmployeeType.ADMIN)) {
           adminController.start();
        } else {
            System.out.println("Person");
        }

    }
}
