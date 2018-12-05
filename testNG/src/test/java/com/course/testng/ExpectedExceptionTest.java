package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionTest1(){
        System.out.println("exception");
        throw  new RuntimeException();
    }
}
