package com.baig;

public class PalindromeChecker {
    public boolean isPalindrome(String input) {
        return input.equalsIgnoreCase(getReversedString(input));
    }

    private String getReversedString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
