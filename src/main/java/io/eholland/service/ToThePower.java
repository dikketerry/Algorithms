package io.eholland.service;

import java.math.BigInteger;

public class ToThePower {
    // insert an integer to the power of another inserted integer
    public BigInteger aToThePowerOfB(int a, int b) {

        if (b < 0 ) {
            throw new IllegalArgumentException("Exponent cannot be below 0");
        }

        // init BigInt
        BigInteger result = BigInteger.ONE;

        // mutliply a by itself b times
        for (int i = 0; i < b; i++) {
            result = result.multiply(BigInteger.valueOf(a));
        }
        
        return result;
    }
}