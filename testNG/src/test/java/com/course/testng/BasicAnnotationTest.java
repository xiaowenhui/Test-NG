package com.course.testng;

import org.testng.Assert;
import org.testng.annotations.*;

//@Test标签用在类前面，表示执行该类里面定义的所有测试方法，测试方法不需要再用@Test标签注释
//@Test
public class BasicAnnotationTest {

    @Test
    public void testAdd() {
        Count count = new Count();
        int result = count.add(2,2);
        Assert.assertEquals(result,4);
        System.out.println("testAdd");
    }
    @Test
    public void testsub() {
        Count count = new Count();
        int result = count.sub(2,2);
        Assert.assertEquals(result,0);
        System.out.println("testAdd");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }


    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMeathod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }


}
