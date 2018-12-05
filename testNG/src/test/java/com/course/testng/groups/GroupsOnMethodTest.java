package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.security.acl.Group;

public class GroupsOnMethodTest {

    @Test(groups="group1")
    public void test1(){
        System.out.println("test1");
    }

    @Test(groups = "group1")
    public void test2(){
        System.out.println("test2");
    }

    @Test(groups = "group1")
    public void test3(){
        System.out.println("test3");
    }

    @Test(groups = "group2")
    public void test4(){
        System.out.println("test4");
    }

    @Test(groups = "group2")
    public void test5(){
        System.out.println("test5");
    }

    @BeforeGroups("group1")
    public void beforeGroupOnGroup1(){
        System.out.println("beforeGroupOnGroup1");
    }

    @AfterGroups("group1")
    public void afterGroupOnGroup1(){
        System.out.println("afterGroupOnGroup1");
    }

    @BeforeGroups("group2")
    public void beforeGroupOnGroup2(){
        System.out.println("beforeGroupOnGroup2");
    }

    @AfterGroups("group2")
    public void afterGroupOnGroup2(){
        System.out.println("afterGroupOnGroup2");
    }

}
