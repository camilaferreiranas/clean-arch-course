package br.com.camilaferreiranas.cleanarch.dataprovider;

import br.com.camilaferreiranas.cleanarch.core.dataprovider.DeleteCustomer;
import br.com.camilaferreiranas.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomer {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
