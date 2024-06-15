package com.sb.post.mapping.example.controller;

import com.sb.post.mapping.example.request.CustomerRequest;
import com.sb.post.mapping.example.response.APIResponse;
import com.sb.post.mapping.example.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<APIResponse> createCustomer(@RequestBody CustomerRequest request) {
        return customerService.createCustomer(request);
    }
}
