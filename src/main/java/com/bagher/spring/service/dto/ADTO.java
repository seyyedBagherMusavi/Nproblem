package com.bagher.spring.service.dto;


import lombok.Data;

import java.util.Set;
@Data
public class ADTO {

    private long id;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String a5;
    private String a6;
    private String a7;
    private String a8;
    private Set<BDTO> bSet;
    private Set<CDTO> cSet;
    private Set<DDTO> dSet;
}
