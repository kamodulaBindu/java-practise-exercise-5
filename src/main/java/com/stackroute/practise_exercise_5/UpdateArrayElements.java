package com.stackroute.practise_exercise_5;

import java.util.List;

public class UpdateArrayElements {
    //method to replace elements in a list
    public static List<String> replacesArrayElements(List<String> list, int[] index, String[] replace) {
        for (int i = 0; i < index.length; i++) {
            list.set(index[i], replace[i]);
        }
        return list;
    }
    //method to clear list
    public static List<String> clearsTheArrayList(List<String> list) {

        list.clear();
        return list;
    }
}


