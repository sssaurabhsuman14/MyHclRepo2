package com.bank.application.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.bank.application.entity.Customer;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>{

}
