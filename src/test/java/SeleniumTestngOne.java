import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.*;

public class SeleniumTestngOne {
    @Test
    public void testMethodOne(){
        System.out.println("Running @test methodOne");
    }
@BeforeSuite
    public void testMethodTwo(){
        System.out.println("Running @BeforeSuite method");
    }
@AfterSuite
    public void testMethodThree(){
        System.out.println("Running @AfterSuite method");
    }
    @BeforeTest
    public void testMethodFour(){
        System.out.println("Running @BeforeTest method");
    }
    @AfterTest
    public void testMethodFive(){
        System.out.println("Running @AfterTest method");
    }
    @BeforeClass
    public void testMethodSix(){
        System.out.println("Running @BeforeClass method");
    }
    @AfterClass
    public void testMethodSeven(){
        System.out.println("Running @AfterClass method");
    }
    @BeforeMethod
    public void testMethodEight(){
        System.out.println("Running @BeforeMethod!!!");
    }
    @AfterMethod
    public void testMethodNine(){
        System.out.println("Running @AfterMethod!!!");
    }
}
