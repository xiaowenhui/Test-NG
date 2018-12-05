package com.course.testng.suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PayTest {
    @Test
    public void payTest(){
        System.out.println("pay successed!");
    }

    @BeforeMethod
    public void beforeTest(){
        System.out.println("beforeTest 运行成功");
    }

    @AfterTest
    public  void  afterTest(){
        System.out.println("afterTest 运行成功");
    }
}
