package com.hotel.josunhotel20221025seoyeong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {

    @GetMapping("/booking/booking")
    public String booking() {
        return "booking/booking";
    }

    @GetMapping("/booking/bookingInfo")
    public String bookingInfo() {
        return "booking/bookingInfo";
    }
}
