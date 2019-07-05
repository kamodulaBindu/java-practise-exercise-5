package com.stackroute.practise_exercise_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PassValueToNextKey {
    //method to set value of key1 to key2 and make value of key1 empty

    public static HashMap keyValue(HashMap<String, String> hashMap) {
        if (hashMap.isEmpty()) {//if hashmap is empty
            return null;
        } else {//if hashmap is not empty
            Iterator<Map.Entry<String, String>> itr = hashMap.entrySet().iterator();
            String str = "";
            if (!hashMap.get("val1").equals(" ")) {
                str = hashMap.get("val1");
                hashMap.put("val1", " ");
            }
            hashMap.put("val2", str);
        }
        return hashMap;
    }
}