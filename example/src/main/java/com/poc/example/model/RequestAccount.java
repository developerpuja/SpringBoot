package com.poc.example.model;

import lombok.Data;

@Data
public class RequestAccount {
    private String object;
    private String req_datetime;
    private AccountData data;
}
