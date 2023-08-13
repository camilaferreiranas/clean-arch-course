package br.com.camilaferreiranas.cleanarch.core.usecase.impl;

import br.com.camilaferreiranas.cleanarch.core.dataprovider.DeleteCustomer;
import br.com.camilaferreiranas.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import br.com.camilaferreiranas.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final DeleteCustomer deleteCustomer;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomer deleteCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomer = deleteCustomer;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomer.delete(id);

    }
}
