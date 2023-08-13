package br.com.camilaferreiranas.cleanarch.core.usecase;

import br.com.camilaferreiranas.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
