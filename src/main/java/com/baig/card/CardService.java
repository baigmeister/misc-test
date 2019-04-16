package com.baig.card;

public class CardService {

    public boolean validateCardNumber(String cardNumber) {
        char[] chars = cardNumber.toCharArray();
        int sum = 0;
        for (int j = 0; j < chars.length; j++) {
            Integer i =  Character.getNumericValue(chars[j]);
            sum += ((j +1) % 2 != 0) ?
                ((i*2 < 9)? i*2 : i*2 % 10 + 1) : i;
        }
        return sum % 10 == 0;
    }
}
