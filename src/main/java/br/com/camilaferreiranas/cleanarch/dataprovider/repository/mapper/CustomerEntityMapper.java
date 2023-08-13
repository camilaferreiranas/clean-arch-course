package br.com.camilaferreiranas.cleanarch.dataprovider.repository.mapper;

import br.com.camilaferreiranas.cleanarch.core.domain.Customer;
import br.com.camilaferreiranas.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
