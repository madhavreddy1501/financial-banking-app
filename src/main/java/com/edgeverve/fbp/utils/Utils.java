package com.edgeverve.fbp.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Utils {
    public String generateAccountNumber() {
        Long randomNumber=UUID.randomUUID().getMostSignificantBits();
        randomNumber = randomNumber < 0 ? randomNumber * -1 : randomNumber;
        return Long.toString(randomNumber);
    }
}
