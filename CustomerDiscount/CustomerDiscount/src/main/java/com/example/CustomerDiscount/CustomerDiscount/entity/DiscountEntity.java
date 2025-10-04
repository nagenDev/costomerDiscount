package com.example.CustomerDiscount.CustomerDiscount.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Setter
@Getter
@Document(collection = "discount3")
public class DiscountEntity {

    //title, coupon code, discount type (Fixed, Percentage), Discount Value,
    // Expiry date, Customer (all or selected customer), minimum discount, maximum discount

    @Id
    private Long Id;
    @Indexed(unique = true)
    private String title;

    private Long couponCode;

    private String discountType;

    private Long disValue;

    private LocalDateTime expiryDate;
    private Long minDis;
    private Long maxDis;
}
