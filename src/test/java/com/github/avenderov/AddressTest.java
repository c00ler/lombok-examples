package com.github.avenderov;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddressTest {

    @Test
    public void testAddressShouldIncludeToString() {
        final Address address = new Address("Berlin", "Winsstr.", "15");

        assertThat(address.toString()).as("Address.toString()").isEqualTo(
                "Address(city=Berlin, street=Winsstr., houseNumber=15)");
    }

    @Test
    public void testShouldCompareObjectsUsingEquals() {
        final Address address1 = new Address("Berlin", "Winsstr.", "15");
        final Address address2 = new Address("Berlin", "Winsstr.", "15");

        assertThat(address1).isEqualTo(address2);
    }

}