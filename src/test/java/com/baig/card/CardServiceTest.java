package com.baig.card;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class CardServiceTest {

    private CardService cardService;

    @Before
    public void init() {
        cardService = new CardService();
    }

    @Test
    public void testValidateCardNumberValid() throws Exception {
        String cardNumber = "4242424242424242";
        boolean result = cardService.validateCardNumber(cardNumber);
        assertTrue(result);
    }

    @Test
    public void testValidateCardNumbeInvalid() {
        String cardNumber = "1111111111111111";
        assertFalse(cardService.validateCardNumber(cardNumber));
    }

}
