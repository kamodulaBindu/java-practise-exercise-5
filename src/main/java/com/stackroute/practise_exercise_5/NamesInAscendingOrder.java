package com.stackroute.practise_exercise_5;


import java.util.*;

class NamesInAscendingOrder
{
    //order strings in a list in ascending order
    public static ArrayList sortInAscendingOrder(List<String> string){
        if(string.size()>0) {//if list is not empty
            TreeSet<String> treeSets = new TreeSet<>();
            treeSets.addAll(string);
            ArrayList<String> result = new ArrayList<>(treeSets);
            return result;
        }
        else {//if list is empty
            return null;
        }
}
}



