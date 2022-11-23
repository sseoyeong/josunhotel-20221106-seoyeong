package com.hotel.josunhotel20221025seoyeong.api;

import com.hotel.josunhotel20221025seoyeong.dto.RegisterReqDto;
import com.hotel.josunhotel20221025seoyeong.dto.validation.ValidationSequence;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RequestMapping("/api/account")
@RestController
@RequiredArgsConstructor
public class AccountApi {

    @PostMapping("/register")
    public ResponseEntity<?> register(@Validated(ValidationSequence.class) @RequestBody RegisterReqDto registerReqDto,
                                      BindingResult bindingResult) throws Exception {

        System.out.println("회원가입 요청 데이터:" + registerReqDto);

        return null;
    }
}
