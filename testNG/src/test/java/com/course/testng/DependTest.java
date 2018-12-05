package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void  testA(){
        System.out.println("testA");
    }

    @Test(dependsOnMethods = "testA")
    public void testB(){
        System.out.println("testB");
    }
}
