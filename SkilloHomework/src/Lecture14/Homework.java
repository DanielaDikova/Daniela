package Lecture14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class Homework {

    private WebDriver driver;

    /**
     * Setup all browser drivers before the test suite execution
     * This setup will be executed only once for the whole test run
     */
    @BeforeSuite
    protected final void setupTestSuite() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
    }

    /**
     * Opens a new window in the browser before the execution of each test method
     * Example: If you have 2 methods: method1 & method2. The execution will be:
     * 1. setUpTest + method1
     * 2. setUpTest + method2
     */
    @BeforeMethod
    protected final void setUpTest() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();

        //Sets timeout to wait for a page to load completely. Works only with get() and navigate().to()
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        /*
        Sets timeout to wait for any element to appear in the DOM tree
        Example:
        If you execute findElement() the driver will be checking for the element to appear in the DOM tree for the duration of 5 seconds
        If element the element is found within the 5 seconds the test execution continues
        Otherwise if the element is not found NoSuchElementException will be thrown
        Important:
        If the element is presented in the DOM tree this doesn't guarantee that the element is visible on the page!
        The implicit wait applies for all elements during the driver's lifecycle
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://training.skillo-bg.com:4300/posts/all");
    }

    /**
     * After each test closes the current browser window
     * Example: If you have 2 methods: method1 & method2. The execution will be:
     * 1. setUpTest + method1 + tearDownTest
     * 2. setUpTest + method2 + tearDownTest
     */
    @AfterMethod
    protected final void tearDownTest() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }

    @Test
    public void testCreatePost() {
        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        loginLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()='Sign in']"))));

        WebElement userNameField = driver.findElement(By.id("defaultLoginFormUsername"));
        userNameField.sendKeys("vidko.v");

        WebElement passwordField = driver.findElement(By.id("defaultLoginFormPassword"));
        passwordField.sendKeys("123abc");

        WebElement signInButton = driver.findElement(By.id("sign-in-button"));
        signInButton.click();

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/posts/all"));

        WebElement createPostLink = driver.findElement(By.id("nav-link-new-post"));
        createPostLink.click();

        ////////////////////////////////////////////////////////////////////////////////
        WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));

        StringBuilder sb = new StringBuilder();

        Path currentRelativePath = Paths.get("");
        String path = currentRelativePath.toAbsolutePath().toString();

        sb.append(path);
        sb.append("\\src\\test\\java\\Lecture14\\6240.jpg");

        fileInput.sendKeys(sb.toString());
        /////////////////////////////////////////////////////////////////////////////////

        WebElement captionInput = driver.findElement(By.xpath("//input[@placeholder='Enter you post caption here']"));
        captionInput.sendKeys("This is Automated test Caption!");

        WebElement createPostButton = driver.findElement(By.id("create-post"));
        createPostButton.click();

        wait.until(ExpectedConditions.textToBe(By.tagName("h2"), "vidko.v"));

        String userProfileAddress = driver.getCurrentUrl();


        Assert.assertEquals(userProfileAddress, "http://training.skillo-bg.com:4300/users/8335", "The post is not posted successfully.");
}

}