package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestScript {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe");

    }
    @Test
    public void iPhone12ProMax(){
    int width = 428;
    int height = 926;
    String device = "iPhone12 Pro Max";
    boolean mobile = true;
    WebDriverManager.edgedriver().setup();
    EdgeDriver driver = new EdgeDriver();
    DevTools devTools = driver.getDevTools();
    devTools.createSession();
    driver.manage().window().setSize(new Dimension(width, height));
    driver.get("https://derivfe.github.io/qa-test/settings");
    methods.delayeecution(5000);
    methods.takesnapshot(driver, device);
    methods.scrolldown(driver,500);
    methods.takesnapshot(driver, device);
    methods.scrolldown(driver,500);
    methods.takesnapshot(driver, device);
    driver.quit();
    }
@Test
   public void iPhone12Pro(){
    int width = 390;
    int height = 844;
    String device = "Iphone 12 Pro";
    boolean mobile = true;

    WebDriverManager.edgedriver().setup();
    EdgeDriver driver = new EdgeDriver();
    DevTools devTools = driver.getDevTools();
    devTools.createSession();
    driver.manage().window().setSize(new Dimension(width, height));
    driver.get("https://derivfe.github.io/qa-test/settings");
    methods.delayeecution(5000);
    methods.takesnapshot(driver, device);
    methods.scrolldown(driver,500);
    methods.takesnapshot(driver, device);
    methods.scrolldown(driver,500);
    methods.takesnapshot(driver, device);
    driver.quit();

}
    @Test
    public void iPhoneXS(){
        int width = 375;
        int height = 812;
        String device = "iPhoneXS";
        boolean mobile = true;
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        driver.manage().window().setSize(new Dimension(width, height));
        driver.get("https://derivfe.github.io/qa-test/settings");
        methods.delayeecution(5000);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        driver.quit();
    }
    @Test
    public void iPhone5(){
        int width = 320;
        int height = 568;
        String device = "Iphone5";
        boolean mobile = true;

        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        driver.manage().window().setSize(new Dimension(width, height));
        driver.get("https://derivfe.github.io/qa-test/settings");
        methods.delayeecution(5000);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        driver.quit();

    }
    @Test
    public void iPadPro(){
        int width = 1024;
        int height = 1366;
        String device = "IPad pro";
        boolean mobile = true;
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        driver.manage().window().setSize(new Dimension(width, height));
        driver.get("https://derivfe.github.io/qa-test/settings");
        methods.delayeecution(5000);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        driver.quit();
    }
    @Test
    public void GooglePixel7(){
        int width = 412;
        int height = 915;
        String device = "GooglePixel7";
        boolean mobile = true;

        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        driver.manage().window().setSize(new Dimension(width, height));
        driver.get("https://derivfe.github.io/qa-test/settings");
        methods.delayeecution(5000);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        driver.quit();

    }
    @Test
    public void GooglePixel3(){
        int width = 412;
        int height = 824;
        String device = "GooglePixel3";
        boolean mobile = true;
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        driver.manage().window().setSize(new Dimension(width, height));
        driver.get("https://derivfe.github.io/qa-test/settings");
        methods.delayeecution(5000);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        driver.quit();
    }
    @Test
    public void SamsungsS20Ultra(){
        int width = 412;
        int height = 915;
        String device = "SamsungS20Ultra";
        boolean mobile = true;

        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        driver.manage().window().setSize(new Dimension(width, height));
        driver.get("https://derivfe.github.io/qa-test/settings");
        methods.delayeecution(5000);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        driver.quit();

    }
    @Test
    public void SamsungS7(){
        int width = 360;
        int height = 640;
        String device = "SamsungS7";
        boolean mobile = true;
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        driver.manage().window().setSize(new Dimension(width, height));
        driver.get("https://derivfe.github.io/qa-test/settings");
        methods.delayeecution(5000);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        driver.quit();
    }
    @Test
    public void OnePlus3(){
        int width = 480;
        int height = 853;
        String device = "OnePlus3";
        boolean mobile = true;

        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        driver.manage().window().setSize(new Dimension(width, height));
        driver.get("https://derivfe.github.io/qa-test/settings");
        methods.delayeecution(5000);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        methods.scrolldown(driver,500);
        methods.takesnapshot(driver, device);
        driver.quit();

    }
@Test
    public  void testfieldRange(){

       methods.testfieldRange(new EdgeDriver());
    }
    @Test
    public  void testBlankSpaceInForm(){

       methods.testBlankSpace(new EdgeDriver());
    }
    @Test
    public void testMandatoryfields(

    ){
        methods.testMandatoryfields();
    }


    @AfterTest
    public void tearDown() {
        // Close the browser window
        if (driver != null) {
            driver.quit();
        }
    }




}
