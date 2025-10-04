package com.example.CustomerDiscount.CustomerDiscount.controller;

import com.example.CustomerDiscount.CustomerDiscount.entity.CostomerEntity;
import com.example.CustomerDiscount.CustomerDiscount.entity.DiscountEntity;
import com.example.CustomerDiscount.CustomerDiscount.service.CostomerService;
import com.example.CustomerDiscount.CustomerDiscount.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dis")
public class Discontroller {
    @Autowired
    private DiscountService discountService;


    @Autowired
    private CostomerService costomerService;


    @GetMapping("id/{id}")
    public List<DiscountEntity> getTheList(@PathVariable Long id){
        return discountService.getList(id);
    }

    @PostMapping("/id/{id}")
    public void saveTheDis(@PathVariable Long id,DiscountEntity discount ) {
        discountService.save(id,discount);
    }

    @DeleteMapping("/id/{id}/title/{title}")
    public void deleteTheDid(@PathVariable Long id,@PathVariable Long title) {
        discountService.deleteTheDis(id,title);
    }




    @PutMapping("id/{id}/did/{did}")
    public void updateTheDiscount(@PathVariable Long id,@PathVariable Long did,@RequestBody DiscountEntity newUser) {
        discountService.save(id, newUser);

    }

}
