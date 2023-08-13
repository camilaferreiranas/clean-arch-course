package br.com.camilaferreiranas.cleanarch.core.usecase;

import br.com.camilaferreiranas.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
