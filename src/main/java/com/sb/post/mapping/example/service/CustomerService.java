package com.sb.post.mapping.example.service;

import com.sb.post.mapping.example.request.CustomerRequest;
import com.sb.post.mapping.example.response.APIResponse;
import org.springframework.http.ResponseEntity;


public interface CustomerService {
    ResponseEntity<APIResponse> createCustomer(CustomerRequest request);
}
