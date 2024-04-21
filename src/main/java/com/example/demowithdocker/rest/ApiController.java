package com.example.demowithdocker.rest;


import com.example.demowithdocker.rest.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ApiController {

    @GetMapping("/getAll")
    public List<Customer> getAllCustomers(){
       System.out.println("Received GET request");
       List<Customer> customers = new ArrayList<>();
       Customer c1 = new Customer("satwinder","satwinder@gmail.com");
       Customer c2 = new Customer("johan","johan@gmail.com");
       Customer c3 = new Customer("magnus","magnus@gmail.com");

       customers.add(c1);
       customers.add(c2);
       customers.add(c3);

       return customers;

    }

}
