package com.stackroute.practise_exercise_5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountOfStringTest {
    CountOfString countOfString;
    @Before
    public void setup(){
        countOfString=new CountOfString();
    }
    @Test
    public void checkTheFrequencyOfWordInTheGivenInput()

    {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);
        Map result=countOfString.countNumberOfRepetitionsOfAString("one one one one two three two three one");
        assertEquals(map,result);
    }
    @Test
    public void givenStringMustReturnCountOfEachString()
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("hi",3);
        map.put("hello",2);
        Map result=countOfString.countNumberOfRepetitionsOfAString("hi helllo hi hi hello");
        assertNotEquals(map,result);
    }
    @Test
    public void givenStringMustReturnCountOfEachStringWordInTheInput()
    {
        Map<String,Integer> map=new HashMap<>();

        map.put("is",3);
        map.put("how",2);
        Map result=countOfString.countNumberOfRepetitionsOfAString("how is is how is");
        assertEquals(map,result);
    }
    @Test
    public void givenInputStringMustReturnNull()
    {
        Map<String,Integer> map=new HashMap<>();
        map=null;
        Map result=countOfString.countNumberOfRepetitionsOfAString("");
        assertEquals(map,result);
    }

    @After
    public void tearDown(){
        countOfString=null;
    }

}

