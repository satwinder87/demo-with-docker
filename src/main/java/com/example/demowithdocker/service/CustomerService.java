package com.example.demowithdocker.service;

import com.example.demowithdocker.repository.CustomerEntity;
import com.example.demowithdocker.repository.CustomerRepository;
import com.example.demowithdocker.rest.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(Customer customer){

        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName(customer.name());
        customerEntity.setEmail(customer.email());
        customerEntity.setCreatedAt(Instant.now());
        customerEntity.setUpdatedAt(Instant.now());

        customerRepository.save(customerEntity);

    }

    public List<Customer> getAllCustomers(){
        List<CustomerEntity> customerEntityList = customerRepository.findAll();

        return customerEntityList.stream()
                .map(customerEntity -> new Customer(customerEntity.getName(), customerEntity.getEmail()))
                .toList();

    }

}
