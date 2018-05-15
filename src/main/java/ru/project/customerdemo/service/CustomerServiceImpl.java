package ru.project.customerdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.customerdemo.model.Customer;
import ru.project.customerdemo.repository.CustomerRepository;

import java.util.List;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
        log.info("in CustomerServiceImpl getById {}", id);
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("in CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("in CustomerServiceImpl delete {}", id);
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("in CustomerServiceImpl getAll {}");
        return customerRepository.findAll();
    }
}
