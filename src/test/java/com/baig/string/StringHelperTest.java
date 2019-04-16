package com.baig.string;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class StringHelperTest {

    StringHelper stringHelper;

    @Before
    public void init() {
        stringHelper = new StringHelper();
    }

    @Test
    public void takeAAOutOfFirstTwoCharOfStringTest() {
        assertEquals("BCDEF", stringHelper.extractAInFirstTwoCharOfStr("AABCDEF"));

    }

    @Test
    public void takeAOutOfFirstTwoCharOfStringTest() {
        assertEquals("BCDEF", stringHelper.extractAInFirstTwoCharOfStr("ABCDEF"));
    }

    @Test
    public void lambda() {
        //IntStream.range(4, 10).forEach(System.out::println);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7, 8);
        list.forEach(a -> System.out.println(a));


    }
    @Test
    public void testCatalogue() {

        String article = "drill";
        String s = "<product><name>hammer</name><qty>5</qty><price>8</price></product>\n\n" +
                   "<product><name>drill</name><qty>9</qty><price>60</price></product>\n\n" +
                   "<product><name>drill</name><qty>45</qty><price>50</price></product>\n\n" +
                   "<product><name>ladder</name><qty>5</qty><price>75</price></product>\n\n";
        String result = Catalogue.getCatalogue(s, article);
    }
}
