package com.example.CustomerDiscount.CustomerDiscount.service;

import com.example.CustomerDiscount.CustomerDiscount.entity.CostomerEntity;
import com.example.CustomerDiscount.CustomerDiscount.entity.DiscountEntity;
import com.example.CustomerDiscount.CustomerDiscount.repository.DisInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {
//4. Create api's to save, get list, update and delete the discount coupon.
    @Autowired
    private DisInterface disInterface;

    @Autowired
    private CostomerService costomerService;

    public List<DiscountEntity> getList(Long id){
        CostomerEntity costomer = costomerService.getBYId(id);
        List<DiscountEntity> dis = costomer.getDiscountEntities();
        return dis;
    }
    public void save(Long id,DiscountEntity discount) {
        CostomerEntity costomer = costomerService.getBYId(id);
        DiscountEntity newDisEntity = disInterface.save(discount);
        costomer.getDiscountEntities().add(newDisEntity);
        costomerService.saveTheCostomer(costomer);
    }

    public void deleteTheDis(Long id,Long title) {
        CostomerEntity costomer = costomerService.getBYId(id);
        DiscountEntity toDelte = null;
        List<DiscountEntity> discountEntities = costomer.getDiscountEntities();
        for(DiscountEntity d:discountEntities) {
            if(d.getTitle().equals(title)) {
                toDelte = d;
                break;
            }
        }
        costomer.getDiscountEntities().remove(toDelte);
        costomerService.saveTheCostomer(costomer);
    }

    public DiscountEntity getById(Long title) {

        return disInterface.findById(title).orElse(null);
    }


//
//    public DiscountEntity updateDiscount(Long discountId, DiscountEntity updatedDiscount) {
//        DiscountEntity existing = disInterface.findById(discountId).orElse(null);
//        if (existing == null) {
//            throw new RuntimeException("Discount not found with id: " + discountId);
//        }
//
//        if (updatedDiscount.getTitle() != null) existing.setTitle(updatedDiscount.getTitle());
//        if (updatedDiscount.getCouponCode() != null) existing.setCouponCode(updatedDiscount.getCouponCode());
//        if (updatedDiscount.getDiscountType() != null) existing.setDiscountType(updatedDiscount.getDiscountType());
//        if (updatedDiscount.getDisValue() != null) existing.setDisValue(updatedDiscount.getDisValue());
//        if (updatedDiscount.getExpiryDate() != null) existing.setExpiryDate(updatedDiscount.getExpiryDate());
//        if (updatedDiscount.getMinDis() != null) existing.setMinDis(updatedDiscount.getMinDis());
//        if (updatedDiscount.getMaxDis() != null) existing.setMaxDis(updatedDiscount.getMaxDis());
//
//        return disInterface.save(existing);
//    }



}
