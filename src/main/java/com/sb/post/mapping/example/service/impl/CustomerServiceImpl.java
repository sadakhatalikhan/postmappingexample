package com.sb.post.mapping.example.service.impl;

import com.sb.post.mapping.example.model.CustomerModel;
import com.sb.post.mapping.example.request.CustomerRequest;
import com.sb.post.mapping.example.response.APIResponse;
import com.sb.post.mapping.example.response.CustomerResponse;
import com.sb.post.mapping.example.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static List<CustomerModel> customers = new ArrayList<>();
    private AtomicInteger c = new AtomicInteger(1);

    @Override
    public ResponseEntity<APIResponse> createCustomer(CustomerRequest request) {

        CustomerModel customerModel = CustomerModel.builder()
                .customerId(c.getAndIncrement())
                .customerName(request.getCustomerName())
                .customerAge(request.getCustomerAge())
                .customerMobileNumber(request.getCustomerMobileNumber())
                .customerEmailAddress(request.getCustomerEmailAddress())
                .customerAddress(request.getCustomerAddress())
                .createdDate(LocalDate.now())
                .build();

        customers.add(customerModel);

        return ResponseEntity.ok(
                APIResponse.builder()
                        .errorCode(000)
                        .data(CustomerResponse.builder()
                                .customerId(customerModel.getCustomerId())
                                .customerName(customerModel.getCustomerName())
                                .customerAge(customerModel.getCustomerAge())
                                .customerMobileNumber(customerModel.getCustomerMobileNumber())
                                .customerEmailAddress(customerModel.getCustomerEmailAddress())
                                .customerAddress(customerModel.getCustomerAddress())
                                .createdDate(customerModel.getCreatedDate())
                                .build()
                        )
                        .build()
        );
    }
}
