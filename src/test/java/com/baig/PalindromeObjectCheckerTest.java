package com.baig;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeObjectCheckerTest {

    PalindromeChecker palindromeChecker;

    @Before
    public void setUp() {
        palindromeChecker = new PalindromeChecker();
    }
    @Test
    public void palindromeObjectCheckerNotNull() {
        assertNotNull(new PalindromeChecker());
    }

    @Test
    public void palindromObjectCheckerSimpleCheck() {
        assertTrue(palindromeChecker.isPalindrome("MOM"));
    }

    @Test
    public void palindromeObjectCheckerTest1() {
        assertFalse(palindromeChecker.isPalindrome("dfsfsffdgdgdgd"));
    }

    @Test
    public void palindromeObjectCheckerComplexTest() {
        assertTrue(palindromeChecker.isPalindrome("Racecar"));
    }
}
