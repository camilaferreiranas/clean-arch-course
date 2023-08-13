package br.com.camilaferreiranas.cleanarch.dataprovider;

import br.com.camilaferreiranas.cleanarch.core.dataprovider.InsertCustomer;
import br.com.camilaferreiranas.cleanarch.core.domain.Customer;
import br.com.camilaferreiranas.cleanarch.dataprovider.repository.CustomerRepository;
import br.com.camilaferreiranas.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
