package br.com.camilaferreiranas.cleanarch.config;

import br.com.camilaferreiranas.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import br.com.camilaferreiranas.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import br.com.camilaferreiranas.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import br.com.camilaferreiranas.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerById(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl customer
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, customer);
    }
}
