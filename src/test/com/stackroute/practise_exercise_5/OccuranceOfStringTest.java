package com.stackroute.practise_exercise_5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class OccuranceOfStringTest {

    OccuranceOfString occuranceOfString;
    @Before
    public void setup(){
        occuranceOfString=new OccuranceOfString();
    }
    @Test
    public void givenArrayMustReturnTrueIfRepeatingMoreThanOnce(){
        String  arr[] = {"a","b","c","d","a","c","c"};
        Map result=occuranceOfString.findTheNumberRepeatingMoreThanOnce(arr);

        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals(map,result);
    }
    @Test
    public void givenArrayMustReturnTrueIfOccuranceIsMoreThanOnceOrFalse(){
        String  arr[] = {"a","b","c","d","a","c","c","a","d","b"};
        Map result=occuranceOfString.findTheNumberRepeatingMoreThanOnce(arr);
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",true);
        map.put("c",true);
        map.put("d",true);
        assertEquals(map,result);

    }
    @Test
    public void CountAndReturnOccuranceOfStringAsTrueIfRepeatingMoreThanOnce() {
        String arr[] = {"a", "b", "c", "d", "a", "c", "c"};
        Map result = occuranceOfString.findTheNumberRepeatingMoreThanOnce(arr);
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",true);
        map.put("c",true);
        map.put("d",true);
        assertNotEquals(map, result);
    }

    @After
    public void tearDown()
    {
        occuranceOfString=null;
    }
}
