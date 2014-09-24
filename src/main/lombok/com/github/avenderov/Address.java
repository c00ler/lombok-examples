package com.github.avenderov;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString(doNotUseGetters = true)
@EqualsAndHashCode(doNotUseGetters = true)
public class Address {

    @Getter
    private final String city;

    @Getter
    private final String street;

    @Getter
    private final String houseNumber;

}
