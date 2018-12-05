package com.course.testng.suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest(){
        System.out.println("login successed!");
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
