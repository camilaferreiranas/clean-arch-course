package br.com.camilaferreiranas.cleanarch.core.dataprovider;

import br.com.camilaferreiranas.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
