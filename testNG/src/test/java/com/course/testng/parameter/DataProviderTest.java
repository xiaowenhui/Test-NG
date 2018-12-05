package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public  void dataProvideTest(String name,int age){
        System.out.println("name:"+name +"; age:" + age);
    }

    @DataProvider(name="data")
    public Object[][]  provideData(){
        Object[][] object = new Object[][]{
                {"zhangsan",27},
                {"lisi",28},
                {"wangwu",29}
        };

        return  object;
    }


}
