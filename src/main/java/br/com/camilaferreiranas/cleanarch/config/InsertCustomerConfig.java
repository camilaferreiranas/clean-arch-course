package br.com.camilaferreiranas.cleanarch.config;

import br.com.camilaferreiranas.cleanarch.core.dataprovider.SendCpfForValidation;
import br.com.camilaferreiranas.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import br.com.camilaferreiranas.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import br.com.camilaferreiranas.cleanarch.dataprovider.InsertCustomerImpl;
import br.com.camilaferreiranas.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {


    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,  InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation

    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
