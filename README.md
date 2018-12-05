# Test-NG

1. 和junit比较
---
     更适合测试人员使用
     比junit覆盖功能更全面，TestNG更适合复杂的集成测试

2. 目录
---
    2.1  maven使用
    2.2  常用测试标签和执行顺序
    2.3  套件测试
    2.4  忽略测试
    2.5  组测试(class,method)
    2.6  依赖测试
    2.7  异常测试
    2.8  参数化(xml,DataProvider)
    2.9  多线程
    2.10  监听器
    2.11  测试报告




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
  ![Image text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/testng%E6%89%A7%E8%A1%8C%E9%A1%BA%E5%BA%8F.png)


三、套件测试
---

1. 新建一个SuiteConfig.java，设置suite执行前和执行后操作
![Image_text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/suite-SuiteConfig.png)
                
2. 新建testng.xml文件
![Image_text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/suite-testngxml.png)
     

四、忽略测试
---

1. 本次测试，不想执行的测试用例
![Image text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/ignore.png)

五、组测试
---
1. 方法分组
   @Test(groups="group1")
   @Test(groups="group2")
   @BeforeGroups("group1")
   @AfterGroups("group1")
   @BeforeGroups("group2")
   @AfterGroups("group2")
           ![Image_text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/groupOnMethod.png)
2. 类分组
   类前使用标签声明：@Test(groups=“group1”)
   测试套件xml文件如下：
              ![Image_text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/groupOnClass.png)
   运行结果
              ![Image_text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/groupOnClass-Result.jpg)
   
六、依赖测试
---
测试方法Ｂ执行的时候依赖测试方法Ａ，需要先执行方法Ａ，然后再执行方法Ｂ
@Test(dependsOnMethods = "testA")
      ![Image text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/dependTest.png)
   
七、异常测试
---
1. 什么时候需要用到异常测试？
2. 期望结果就是一个异常的时候，传入某些参数，程序抛出异常
   @Test(expectedExceptions = RuntimeException.class)
          ![Image_text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/exceprtionTest.png)
    
八、参数化
---
1. XML文件参数化
       测试类使用@Parameters({"name","age"}) 进行注释
       测试套件文件如下：
             ![Image_text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/prameter-xml.png)
2. DataProvider参数化
      测试方法指定dataProvider   @Test(dataProvider = "data")
      编写dataProvider
             ![Image_text](https://github.com/xiaowenhui/testNG-learn/blob/master/images/parameter-dataprovider.png)


九、多线程测试
---


十、监听器
---


十一、测试报告
---




