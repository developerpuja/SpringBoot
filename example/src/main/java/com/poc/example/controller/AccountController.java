package com.poc.example.controller;

import com.poc.example.model.Account;
import com.poc.example.model.RequestAccount;
import com.poc.example.repository.AccountRepository;
import com.poc.example.repository.EmployeeRepo;
import com.poc.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private AccountService accountService;


    @PostMapping("/account")
    public ResponseEntity<Account> createAccount(@RequestBody RequestAccount requestAccount)  {
        ResponseEntity<Account> response = null;
         try {
             response = new ResponseEntity<>(accountService.saveAccount(requestAccount), HttpStatus.OK);
         } catch (NullPointerException ne) {
             response = new ResponseEntity<>( HttpStatus.BAD_REQUEST);
         }

        return response;
    }



//    @PostMapping("/update/{id}")
//    public ResponseEntity<Account> updateAccount(@PathVariable("id") long id, @RequestBody Account account)  {
//        return null; //new ResponseEntity<>();
//    }

//    @GetMapping("/get")
//    public RequestAccount getAccount() {
//        RequestAccount requestAccount = new RequestAccount();
//
//        AccountData accountData = new AccountData();
//        List<Account> data =  new ArrayList<>();
//        Account account = new Account();
//
//        account.setName("ssoss");
//        account.setParentAccountName("fgf");
//        account.setType("Ty");
//        account.setWebsite("web");
//        data.add(account);
//        accountData.setAccount(data);
//
//        requestAccount.setObject("something");
//        requestAccount.setReq_datetime("somedate");
//        requestAccount.setData(accountData);
//
//        return requestAccount;
//    }

//    @PostMapping("/save")
//    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
//        ResponseEntity<Employee> response = null;
//        if (employee == null) {
//            Employee emp =  employeeRepo.save(employee);
//          response =  new ResponseEntity<>(emp, HttpStatus.CREATED);
//        } else {
//            response =  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        return response;
//    }
}
