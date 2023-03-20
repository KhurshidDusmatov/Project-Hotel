package com.company.controller;

import com.company.service.AuthService;
import com.company.util.ScannerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {

    @Autowired
    private AuthService authService;

    public void start() {
        boolean game = true;
        while (game) {
            menu();
            int action = ScannerUtil.SCANNER_NUM.nextByte();
            switch (action) {
                case 1:

                    break;
                case 2:

                    break;
                case 0:
                    game = false;
                default:
                    System.out.println("Mazgi nima bu");
            }
        }
    }

    public void menu() {
        System.out.println("-----> Menu <--------");
        System.out.println("1. Login > ");
        System.out.println("2. Complain");
        System.out.println("0. Exit > ");
    }
}
