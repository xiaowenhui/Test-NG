package com.course.testng;
import org.testng.annotations.Test;

public class IgonreTest {


    @Test
    public void  ignoreTest1(){
        System.out.println("ignoreTest1");
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("igonreTest2");
    }

    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("ignoreTest3");
    }

}
