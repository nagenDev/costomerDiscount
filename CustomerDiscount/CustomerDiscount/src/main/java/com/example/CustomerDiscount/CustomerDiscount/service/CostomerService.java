package com.example.CustomerDiscount.CustomerDiscount.service;

import com.example.CustomerDiscount.CustomerDiscount.entity.CostomerEntity;
import com.example.CustomerDiscount.CustomerDiscount.repository.CostomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostomerService {
    @Autowired
    private CostomerRepo costomerRepo;

    public List<CostomerEntity> getAllCostomer() {
        return costomerRepo.findAll();
    }
    public CostomerEntity getBYId(Long id) {
        return costomerRepo.findById(id).orElse(null);
    }


    public void saveTheCostomer(CostomerEntity costomer) {
        costomerRepo.save(costomer);
    }

}
