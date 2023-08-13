package br.com.camilaferreiranas.cleanarch.dataprovider;

import br.com.camilaferreiranas.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.camilaferreiranas.cleanarch.core.domain.Address;
import br.com.camilaferreiranas.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import br.com.camilaferreiranas.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {


    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAdress(addressResponse);
    }
}
