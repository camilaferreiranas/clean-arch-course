package br.com.camilaferreiranas.cleanarch.core.usecase.impl;

import br.com.camilaferreiranas.cleanarch.core.dataprovider.FindCustomerById;
import br.com.camilaferreiranas.cleanarch.core.domain.Customer;
import br.com.camilaferreiranas.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
