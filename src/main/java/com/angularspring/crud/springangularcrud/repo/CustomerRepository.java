package com.angularspring.crud.springangularcrud.repo;

import com.angularspring.crud.springangularcrud.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByAge(int age);
}
