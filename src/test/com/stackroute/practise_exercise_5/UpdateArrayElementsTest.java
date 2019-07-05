package com.stackroute.practise_exercise_5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayElementsTest {
    UpdateArrayElements updateArrayElements;
    @Before
    public void setUp()
    {
        updateArrayElements=new UpdateArrayElements();
    }
    @Test
    public void givenArrayListReturnsTheListWithReplacedArrayElements(){
        List<String> set=new ArrayList<>();
        set.add("Apple");
        set.add("Grape");
        set.add("Melon");
        set.add("Berry");
        int[] position={0,2};
        String[] replace = {"apple","Kiwi"};
        List<String> result=  updateArrayElements.replacesArrayElements(set,position,replace);
        List<String> output=new ArrayList<>();
        output.add("apple");
        output.add("Grape");
        output.add("Kiwi");
        output.add("Berry");
        assertEquals(output,result);
    }
    @Test
    public void givenArrayListReturnsEmptyList(){
        List<String> set=new ArrayList<>();
        set.add("hi");
        set.add("helo");
        set.add("how");
        set.add("are you");
        List<String> result=updateArrayElements.clearsTheArrayList(set);
        List<String> expected=new ArrayList<>();
        assertEquals(expected,result);

    }
    @After
    public void tearDown(){
        updateArrayElements=null;
    }




}
