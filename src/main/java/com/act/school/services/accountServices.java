package com.act.school.services;

import com.act.school.domains.Account;
import com.act.school.repositories.accountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountServices {
    @Autowired private accountRepository AccountRepository;
    public Account createAccount(Account account){
        return AccountRepository.save(account);

    }

}
