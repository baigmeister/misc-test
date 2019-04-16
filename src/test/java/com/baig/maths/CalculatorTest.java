package com.baig.maths;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator underTest;

    @Before
    public void init() {
        underTest = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = 1 + 2;


        assertThat(underTest.add(1, 2), is(result));

        result = 6 + 7 + (-5) + 20 + 5;
        assertThat(underTest.add(6, 7, -5, 20, 5), is(result));

        result = 0 + 0;
        assertThat(underTest.add(0, 0), is(0));

    }

    @Test
    public void testSubtract() {
        int result = 8 - 1;
        assertThat(underTest.subtractor(8, 1), is(result));

        result = 8 - 5  -1;
        assertThat(underTest.subtractor(8,5,1), is(result));

        result = 9 - 9 - 0;
        assertThat(underTest.subtractor(9,9,0), is(result));

        result = 0 - 0;
        assertThat(underTest.subtractor(0,0), is(result));
    }
}
