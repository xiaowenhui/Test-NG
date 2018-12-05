# Test-NG
更适合测试人员使用
比junit覆盖功能更全面，TestNG更适合复杂的集成测试


一、maven使用，如下
---

<dependency>

    <groupId>org.testng</groupId>

    <artifactId>testng</artifactId>

    <version>6.14.3</version>

    <scope>test</scope>

</dependency>

二、常用测试标签和执行顺序
---

  1.  @BeforeSuite，@AfterSuite 

  2.  @BeforeTest，@AfterTest

  3.  @BeforeClass，@AfterClass

  3.  @BeforeMethod，@AfterMethod

  4.  @Test（用在类上表示执行类中所有方法，也可以在方法上表示执行该方法）



三、套件测试

     1. 新建一个SuiteConfig.java，设置suite执行前和执行后操作

     [质量管控部 > 3.5-TestNG框架总结 > image2018-12-5_11-4-49.png]

    2. 新建testng.xml文件

     [质量管控部 > 3.5-TestNG框架总结 > image2018-12-5_11-6-17.png]

    3.运行结果

     

四、忽略测试

   本次测试，不想执行的测试用例



五、组测试

      1）方法分组

           @Test(groups="group1")

          @Test(groups="group2")

 @BeforeGroups("group1")

 @AfterGroups("group1")

 @BeforeGroups("group2")

 @AfterGroups("group2")



      2）类分组

       类前使用标签声明：@Test(groups=“group1”)

       测试套件xml文件如下：

       [质量管控部 > 3.5-TestNG框架总结 > image2018-12-5_12-29-55.png]

     运行结果


六、依赖测试

   测试方法Ｂ执行的时候依赖测试方法Ａ，需要先执行方法Ａ，然后再执行方法Ｂ

　@Test(dependsOnMethods = "testA")



　


七、异常测试

    什么时候需要用到异常测试？

    期望结果就是一个异常的时候，传入某些参数，程序抛出异常

    @Test(expectedExceptions = RuntimeException.class)




八、参数化

    1）XML文件参数化

       测试类使用@Parameters({"name","age"}) 进行注释

       测试套件文件如下：

       [质量管控部 > 3.5-TestNG框架总结 > image2018-12-5_13-45-43.png]

    2）DataProvider参数化

    测试方法指定dataProvider   @Test(dataProvider = "data")

    编写dataProvider

    [质量管控部 > 3.5-TestNG框架总结 > image2018-12-5_13-55-18.png]



九、多线程测试


十、监听器


十一、测试报告




