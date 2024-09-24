package com.datn.beestyle.mapper;

import com.datn.beestyle.common.IGenericMapper;
import com.datn.beestyle.dto.user.customer.CreateCustomerRequest;
import com.datn.beestyle.dto.user.customer.CustomerResponse;
import com.datn.beestyle.dto.user.customer.UpdateCustomerRequest;
import com.datn.beestyle.entity.user.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends IGenericMapper<Customer, CreateCustomerRequest, UpdateCustomerRequest, CustomerResponse> {

    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "deleted",source = "deleted")
    @Override
    Customer toCreateEntity(CreateCustomerRequest request);

    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Override
    void toUpdateEntity(@MappingTarget Customer entity, UpdateCustomerRequest request);

    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createAt",ignore = true)
    @Override
    List<Customer> toCreateEntityList(List<CreateCustomerRequest> dtoCreateList);
}
