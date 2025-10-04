package com.example.CustomerDiscount.CustomerDiscount.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Document(collection = "costomer3")
public class CostomerEntity {
    //id,name,email,mobile
    @Id
    private Long id;
    @Indexed(unique = true)
    private String username;
    private String email;
    private Long mobileNo;
    @DBRef
    List<DiscountEntity> discountEntities = new ArrayList<>();
}