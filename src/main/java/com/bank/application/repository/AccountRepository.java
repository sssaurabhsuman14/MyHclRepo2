package com.bank.application.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bank.application.entity.Account;

@Repository
public interface AccountRepository extends PagingAndSortingRepository<Account, Long>{

}
