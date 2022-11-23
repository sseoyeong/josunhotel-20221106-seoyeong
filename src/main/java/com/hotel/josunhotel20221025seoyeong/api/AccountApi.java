package com.hotel.josunhotel20221025seoyeong.api;


import com.hotel.josunhotel20221025seoyeong.dto.RegisterReqDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/account")
@RestController
public class AccountApi {

    @PostMapping("/register")
    public ResponseEntity<?> register(RegisterReqDto registerReqDto) {
        System.out.println("회원가입 요청 데이터:" + registerReqDto);
        return null;
    }
}
