package com.act.school.repositories;

import com.act.school.domains.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accountRepository extends CrudRepository<Account, Long> {
}
