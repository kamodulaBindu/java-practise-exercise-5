package com.stackroute.practise_exercise_5;

import java.util.*;

public class CountOfString {
    //method to count how many times a word is Occuring in a string
    public Map countNumberOfRepetitionsOfAString(String input) {
        if (input.length() > 1) {//if string is not empty return count
            List<String> listitems = Arrays.asList(input.split(" "));
            Map<String, Integer> map = new HashMap<>();
            if (listitems == null) {
                map = null;
            }
            for (String each : listitems) {
                if (map.containsKey(each)) {

                    map.replace(each, map.get(each) + 1);
                } else {
                    map.put(each, 1);
                }
            }
            return map;

        } else {//if string is empty return null
            return null;
        }
    }
}