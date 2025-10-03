package org.example.javarestapi.controller;

import lombok.Getter;
import org.example.javarestapi.model.Customer;
import org.example.javarestapi.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        var list = customerService.findAll();
        if(list.isEmpty()) {
            return ResponseEntity.noContent().build(); // NO_CONTENT return HTTP 204
        }
        return ResponseEntity.ok(list); // OK return HTTP 200
    }

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        var c = customerService.createCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }
}
