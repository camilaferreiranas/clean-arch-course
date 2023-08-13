package br.com.camilaferreiranas.cleanarch.entrypoint.consumer;

import br.com.camilaferreiranas.cleanarch.core.usecase.UpdateCustomerUseCase;
import br.com.camilaferreiranas.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import br.com.camilaferreiranas.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {


    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "camilaferreiranas")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
