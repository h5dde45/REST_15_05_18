package ru.project.customerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.project.customerdemo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
