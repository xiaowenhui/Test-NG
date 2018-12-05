package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups="group1")
public class GroupsOnClassTest2 {
    public void groupOnclassTest1(){
        System.out.println("groupOnclassTest2");
    }
}