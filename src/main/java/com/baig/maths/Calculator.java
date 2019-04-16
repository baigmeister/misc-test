package com.baig.maths;

public class Calculator implements Adder, Subtractor {
    @Override
    public int add(int... operands) {
        int result = 0;
        for (int operand: operands) {
            result += operand;

        }
        return result;
    }

    @Override
    public int subtractor(int... operands) {
        int result = operands[0];
        for (int i = 1; i < operands.length; i++) {
            result -= operands[i];
        }
        return result;
    }
}
