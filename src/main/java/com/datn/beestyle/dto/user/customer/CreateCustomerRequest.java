package com.datn.beestyle.dto.user.customer;

import com.datn.beestyle.entity.Address;
import com.datn.beestyle.entity.cart.ShoppingCart;
import com.datn.beestyle.enums.Gender;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateCustomerRequest {

    String fullName;
    LocalDate dateOfBirth;
    Gender gender;
    String phoneNumber;
    String email;
    String password;
    boolean deleted;

    ShoppingCart shoppingCart;
    Set<Address> addresses = new HashSet<>();


}