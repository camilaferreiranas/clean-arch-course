package br.com.camilaferreiranas.cleanarch.dataprovider;

import br.com.camilaferreiranas.cleanarch.core.dataprovider.UpdateCustomer;
import br.com.camilaferreiranas.cleanarch.core.domain.Customer;
import br.com.camilaferreiranas.cleanarch.dataprovider.repository.CustomerRepository;
import br.com.camilaferreiranas.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerMapper = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerMapper);
    }
}
