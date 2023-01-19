package com.poc.example.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class AccountData {
    private List<Account> account;
}
