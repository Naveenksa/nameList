package com.naveen.nameList.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Form {

    private String name;
    private String fatherName;
    private String motherName;
    private String place;
    private String dob;
    private Long pinCode;

}
