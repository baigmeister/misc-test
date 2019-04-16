package com.baig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;

import static junit.framework.TestCase.assertTrue;

@RunWith(JUnit4.class)
public class MiscTest {

    public void modifyHashMap(final HashMap hashMap) {
        hashMap.put("4", "four");
        assertTrue(true);

    }

    public void getHashMapVal(final HashMap hashMap) {
        hashMap.get("2)");
        assertTrue(true);
    }

    @Test
    public void testFinalHashMap() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "one");
        hashMap.put("2", "two");
        hashMap.put("3", "three");
        //modifyHashMap(hashMap);
        getHashMapVal(hashMap);



    }
}
