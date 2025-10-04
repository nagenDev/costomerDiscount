package com.example.CustomerDiscount.CustomerDiscount.controller;

import com.example.CustomerDiscount.CustomerDiscount.entity.CostomerEntity;
import com.example.CustomerDiscount.CustomerDiscount.service.CostomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/costomer")
public class CustomerController {

    @Autowired
    private CostomerService costomerService;

    @GetMapping
    public List<CostomerEntity> getTheCustmer(){
        return costomerService.getAllCostomer();
    }

    @PostMapping
    public void saveTheCustomer(@RequestBody CostomerEntity costomer){
        costomerService.saveTheCostomer(costomer);
    }



}
