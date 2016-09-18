**tests.demo_01_testng_hello_world**

Show basics of TestNG hooks.

Add TestNG dependency to pom.xml:
```
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>6.8</version>
            <scope>test</scope>
        </dependency>
```   
     
Test methods are annotated with @Test:
```
    @Test(groups = {"android"}, priority = 10)
    public void test12() {
        System.out.println("Test12 is running...");
    }
```

See assert demos in
- tests.demo_01_testng_hello_world.AssertTests

See hook demos in
- tests.demo_01_testng_hello_world.BaseTest

See test properties demos in
- tests.demo_01_testng_hello_world.SmokeTests1
- tests.demo_01_testng_hello_world.SmokeTests2