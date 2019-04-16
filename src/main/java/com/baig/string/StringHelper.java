package com.baig.string;

public class StringHelper {
    public String extractAInFirstTwoCharOfStr(String input) {
        String prefix = input.substring(0, 2);
        String suffix = input.substring(2, input.length());
        prefix = prefix.replaceAll("[A]*", "");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prefix);
        stringBuilder.append(suffix);


        return stringBuilder.toString();
    }
}
