package br.com.camilaferreiranas.cleanarch.core.usecase;

import br.com.camilaferreiranas.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);


}
