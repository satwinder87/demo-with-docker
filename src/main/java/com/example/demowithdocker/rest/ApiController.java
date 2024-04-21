package com.example.demowithdocker.rest;


import com.example.demowithdocker.rest.model.Customer;
import com.example.demowithdocker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ApiController {

    private CustomerService customerService;

    @Autowired
    public ApiController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers(){
       return customerService.getAllCustomers();
    }

    @PostMapping("/customer")
    public Customer createCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return customer;
    }

}
