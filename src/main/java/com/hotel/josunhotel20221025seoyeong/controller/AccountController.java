package com.hotel.josunhotel20221025seoyeong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/account/login")
    public String login() {
        return "account/login";
    }

}
