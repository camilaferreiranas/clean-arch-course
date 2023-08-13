package br.com.camilaferreiranas.cleanarch.config;

import br.com.camilaferreiranas.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import br.com.camilaferreiranas.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import br.com.camilaferreiranas.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import br.com.camilaferreiranas.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
