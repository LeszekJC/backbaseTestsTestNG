package tests.demo_01_junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JunitTest1 {

    //execute only once, in the starting
    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    //execute only once, in the end
    @AfterClass
    public static void  afterClass() {
        System.out.println("in after class");
    }

    //execute for each test, before executing test
    @Before
    public void before() {
        System.out.println("in before");
    }

    //execute for each test, after executing test
    @After
    public void after() {
        System.out.println("in after");
    }

    @Test
    public void testCase11() {
        System.out.println("in test testCase11");

        int number1 = 1;
        int number2 = 2;

        // Will pass if number1 < number2
        // If number1 >= number2 will fail with specified message
        assertTrue("number2 is not greater than number1", number1 < number2);
    }

    @Test
    public void testCase12() {
        System.out.println("in test testCase12");
        String str = "Junit is working fine";
        assertEquals("String are not equal, something went wrong!", "Junit is working fine", str);
    }
}
