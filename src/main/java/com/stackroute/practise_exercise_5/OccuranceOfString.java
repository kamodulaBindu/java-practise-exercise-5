package com.stackroute.practise_exercise_5;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfString {
    //method to return true if word is repeating more than once in string array or false if repeating only once
    public Map findTheNumberRepeatingMoreThanOnce(String[] input) {
        if (input.length > 0) {//if String array is not empty
            Map<String, Integer> map = new HashMap<>();
            if (input == null) {
                map = null;
            }
            for (String each : input) {
                if (map.containsKey(each)) {

                    map.replace(each, map.get(each) + 1);
                } else {
                    map.put(each, 1);
                }
            }
            Map<String, Boolean> list = new HashMap<>();
            for (String each : input) {
                if (map.get(each) >= 2) {
                    list.put(each, true);
                } else {
                    list.put(each, false);
                }
            }
            return list;
        } else { //if string array is empty
            return null;
        }
    }

}

