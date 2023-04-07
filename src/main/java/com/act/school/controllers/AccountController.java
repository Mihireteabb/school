package com.act.school.controllers;
import com.act.school.domains.Account;
import com.act.school.services.accountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class AccountController {
    @Autowired private accountServices AcountServices;
    @PostMapping("/api/accounts")
    public Account createAccount(@RequestBody Account account){
       return AcountServices.createAccount(account);

    }
}
