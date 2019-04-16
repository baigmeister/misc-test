package com.baig.string;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Catalogue {
    // String s = <product><name>hammer</name><qty>5</qty><price>8</price></product>\n\n
    //<product><name>drill</name><qty>9</qty><price>60</price></product>\n\n
    //<product><name>drill</name><qty>45</qty><price>50</price></product>\n\n
    //<product><name>ladder</name><qty>5</qty><price>75</price></product>\n\n
    // output article: ladder, quantity: 5 and price: $75
    public static String getCatalogue(String s, String article) {
        String[] items = s.split("\n\n");
        List<String> results = new ArrayList<>();
        String regex = "(<product><name>)(\\w*)(<\\/name><qty>)(\\d+)(<\\/qty><price>)(\\d+)(<\\/price><\\/product>)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;

        for (String item: items) {
            matcher = pattern.matcher(item);
            if (matcher.matches()) {
                if (article.equals(matcher.group(2))) {
                    System.out.println(matcher.group(2) + ", quantity: " + matcher.group(4) + " price: " + matcher.group(6));
                }

            }



        }
        return null;
    }

}
