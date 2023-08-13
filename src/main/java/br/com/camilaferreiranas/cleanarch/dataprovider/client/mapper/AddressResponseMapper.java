package br.com.camilaferreiranas.cleanarch.dataprovider.client.mapper;

import br.com.camilaferreiranas.cleanarch.core.domain.Address;
import br.com.camilaferreiranas.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {


    Address toAdress(AddressResponse addressResponse);
}
