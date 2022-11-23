package com.hotel.josunhotel20221025seoyeong.dto;

import com.hotel.josunhotel20221025seoyeong.dto.validation.ValidationGroups;
import lombok.Data;

@Data
public class RegisterReqDto {

    private String lastName;

    private String firstName;

    private String ID;

    private String password;

    private String cfPassword;
}
