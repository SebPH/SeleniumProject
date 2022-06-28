package test;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagLabsTests {

    WebDriver driver;
    String userName;
    String password;
    SeleniumToolKit _;

    public SwagLabsTests() {

        driver = new ChromeDriver();
        _ = new SeleniumToolKit(driver);
        userName = "standard_user";
        password = "secret_sauce";
    }

    @BeforeClass
    public static void OneTimeSetUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
    }

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() {

        driver.quit();
    }

    @Test
    public void logIn() {

        _.write("[placeholder='Username']", userName);
        _.write("[placeholder='Password']", password);
        _.click(".login-box .submit-button");

        // validations
        _.displayed("//span[contains(text(),'Products')]", "xpath");
        _.on("https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void leftPaneNav() {

    }

    @Test
    public void addToCart() {

    }

    @Test
    public void checkOut() {

    }

    @Test
    public void logOut() {

    }
}
