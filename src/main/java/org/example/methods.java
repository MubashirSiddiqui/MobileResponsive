package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class methods {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static Map<String, Object> devicemetrics(int width, int height, double deviceScaleFactor, boolean mobile){

        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", width);
        deviceMetrics.put("height", height);
        deviceMetrics.put("deviceScaleFactor", deviceScaleFactor);
        deviceMetrics.put("mobile", mobile);
        return deviceMetrics;
    }
public static void testBlankSpace(EdgeDriver driver){
    WebDriverManager.edgedriver().setup();
    DevTools devTools = driver.getDevTools();
    driver.get("https://derivfe.github.io/qa-test/settings");
    driver.manage().window().setSize(new Dimension(974, 1032));
    driver.findElement(By.id("fname")).click();
    System.out.println(ANSI_GREEN+"Validation Pass: Salutation is by-default selected"+ANSI_RESET);

    WebElement firstNameField = driver.findElement(By.id("fname"));
    firstNameField.sendKeys(" ");
    if (firstNameField.getAttribute("value").equals(" ")) {
        System.out.println(ANSI_RED+"Validation Failed: Blank Space is Entered in First Name field"+ANSI_RESET);
    } else {
        System.out.println(ANSI_GREEN+"Validation Pass: Firstname field should not be blank"+ANSI_RESET);
    }
    WebElement lastNameField = driver.findElement(By.id("lname"));
    lastNameField.sendKeys(" ");
    if (lastNameField.getAttribute("value").equals(" ")) {
        System.out.println(ANSI_RED+"Validation Failed: Blank Space is Entered in Last Name field"+ANSI_RESET);
    } else {
        System.out.println(ANSI_GREEN+"Validation Pass: Lastname field should not be blank"+ANSI_RESET);
    }
    WebElement dob = driver.findElement(By.id("dob"));
    dob.click();
    dob.sendKeys("2024-01-06");
    if (dob.getAttribute("value").equals("2024-01-06")) {
        System.out.println(ANSI_GREEN+"Validation Pass: Lastname field should not be blank"+ANSI_RESET);
    } else {
        System.out.println(ANSI_RED+"Validation failed: Calender date validation, outside the range"+ANSI_RESET);
    }
    WebElement address = driver.findElement(By.id("address"));
    address.click();
    address.sendKeys(" ");
    if (address.getAttribute("value").equals(" ")) {
        System.out.println(ANSI_RED+"Validation failed: Address validation is not in the range"+ANSI_RESET);
    } else {
        System.out.println(ANSI_GREEN+"Validation Pass: Address  validation is working"+ANSI_RESET);
    }


    WebElement city = driver.findElement(By.id("city"));
    city.sendKeys(" ");

    if (city.getAttribute("value").equals(" ")) {
        System.out.println(ANSI_RED+"Validation Failed: Blank Space is Entered in City field"+ANSI_RESET);
    } else {
        System.out.println(ANSI_GREEN+"Validation Pass: City field should not be blank"+ANSI_RESET);
    }

    WebElement state = driver.findElement(By.id("state"));
    state.sendKeys(" ");

    if (city.getAttribute("value").equals(" ")) {
        System.out.println(ANSI_RED+"Validation Failed: Blank Space is Entered in state field"+ANSI_RESET);
    } else {
        System.out.println(ANSI_GREEN+"Validation Pass: state field should not be blank"+ANSI_RESET);
    }

    WebElement zip = driver.findElement(By.id("zip"));
    zip.sendKeys(" ");

    if (city.getAttribute("value").equals(" ")) {
        System.out.println(ANSI_RED+"Validation Failed: Blank Space is Entered in zip field"+ANSI_RESET);
    } else {
        System.out.println(ANSI_GREEN+"Validation Pass: zip field should not be blank"+ANSI_RESET);
    }


    WebElement tel = driver.findElement(By.id("tel"));
    tel.sendKeys(" ");

    if (city.getAttribute("value").equals(" ")) {
        System.out.println(ANSI_RED+"Validation Failed: Blank Space is Entered in Telephone field"+ANSI_RESET);
    } else {
        System.out.println(ANSI_GREEN+"Validation Pass: Telephone field should not be blank"+ANSI_RESET);
    }

    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys("abc@g.com");

    if (email.getAttribute("value").equals(" ")) {
        System.out.println(ANSI_RED+"Validation Failed: Blank Space is Entered in City field"+ANSI_RESET);
    } else {
        System.out.println(ANSI_GREEN+"Validation Pass: Regix in email field is working"+ANSI_RESET);
    }

    WebElement website = driver.findElement(By.id("website"));
    website.sendKeys(" ");

    if (website.getAttribute("value").equals(" ")) {
        System.out.println(ANSI_RED+"Validation Failed: Blank Space is Entered in website field"+ANSI_RESET);
    } else {
        System.out.println(ANSI_GREEN+"Validation Pass: Website field should not be blank"+ANSI_RESET);
    }

    driver.findElement(By.id("btn-submit-profile")).click();
    devTools.disconnectSession();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.quit();
}

public static void testfieldRange(EdgeDriver driver){
        WebDriverManager.edgedriver().setup();
        DevTools devTools = driver.getDevTools();
        driver.get("https://derivfe.github.io/qa-test/settings");
        driver.manage().window().setSize(new Dimension(974, 1032));
        driver.findElement(By.id("fname")).click();
        System.out.println(ANSI_GREEN+"Validation Pass: Salutation is by-default selected"+ANSI_RESET);


        WebElement firstNameField = driver.findElement(By.id("fname"));
        firstNameField.sendKeys("The quick brown fox jumps over the lazy dog");

        if (firstNameField.getAttribute("value").equals("The quick brown fox jumps over the lazy dog")) {
            System.out.println(ANSI_RED+"Validation Failed: Character limit is missing in FirstName field"+ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Validation Pass: First Name characters should be in range limit"+ANSI_RESET);
        }

        WebElement lastNameField = driver.findElement(By.id("lname"));
        lastNameField.sendKeys("The quick brown fox jumps over the lazy dog");

        if (lastNameField.getAttribute("value").equals("Firstname characters should be in range limit")) {
            System.out.println(ANSI_RED+"Validation Failed: Character limit is missing in Last Name field"+ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Validation Pass: Last Name characters should be in range limit"+ANSI_RESET);
        }



        WebElement dob = driver.findElement(By.id("dob"));
        dob.click();
        dob.sendKeys("2024-01-06");
        if (dob.getAttribute("value").equals("2024-01-06")) {
            System.out.println(ANSI_GREEN+"Validation Pass: DOB is in correct format"+ANSI_RESET);
        } else {
            System.out.println(ANSI_RED+"Validation failed: DOB is not in correct format"+ANSI_RESET);
        }


        WebElement address = driver.findElement(By.id("address"));
        address.click();
        address.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
        if (address.getAttribute("value").equals("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum")) {
            System.out.println(ANSI_RED+"Validation failed: Address field is outside the range limit"+ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Validation Pass: Address field is in the range limit"+ANSI_RESET);
        }


        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("The quick brown fox jumps over the lazy dog");

        if (city.getAttribute("value").equals("The quick brown fox jumps over the lazy dog")) {
            System.out.println(ANSI_RED+"Validation Failed: Character limit is missing in City field"+ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Validation Pass: City field should not be blank"+ANSI_RESET);
        }

        WebElement state = driver.findElement(By.id("state"));
        state.sendKeys("The quick brown fox jumps over the lazy dog");

        if (state.getAttribute("value").equals("The quick brown fox jumps over the lazy dog")) {
            System.out.println(ANSI_RED+"Validation Failed: Character limit is missing in State field"+ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Validation Pass: state field should not be blank"+ANSI_RESET);
        }

        WebElement zip = driver.findElement(By.id("zip"));
        zip.sendKeys("The quick brown fox jumps over the lazy dog121");

        if (zip.getAttribute("value").equals("The quick brown fox jumps over the lazy dog121")) {
            System.out.println(ANSI_RED+"Validation Failed: Alphanumeric characters is Entered in zip field"+ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Validation Pass: Numeric characters is Entered in zip field"+ANSI_RESET);
        }


        WebElement tel = driver.findElement(By.id("tel"));
        tel.sendKeys("The quick brown fox jumps over the lazy dog12323");

        if (tel.getAttribute("value").equals("The quick brown fox jumps over the lazy dog12323")) {
            System.out.println(ANSI_RED+"Validation Failed: Alphanumeric characters is Entered in Telephone field"+ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Validation Pass: Numeric characters is Entered in zip field"+ANSI_RESET);
        }

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("abc@g.com");

        if (email.getAttribute("value").equals(" ")) {
            System.out.println(ANSI_RED + "Validation Failed: Email field is not in empty" + ANSI_RESET);
        }
        else if (email.getAttribute("value").equals("abc@g.com")){
            System.out.println(ANSI_GREEN+"Validation Pass: Regix in email field is working"+ANSI_RESET);

        } else {
            System.out.println(ANSI_GREEN+"Validation Pass: Email field is in correct format"+ANSI_RESET);

        }

        WebElement website = driver.findElement(By.id("website"));
        website.sendKeys("The quick brown fox jumps over the lazy dog");

        if (website.getAttribute("value").equals(" ")) {
            System.out.println(ANSI_RED+"Validation Failed: Blank Space is Entered in website field"+ANSI_RESET);
        }
        else if (website.getAttribute("value").equals("The quick brown fox jumps over the lazy dog")){
            System.out.println(ANSI_RED+"Validation Failed: website field is not in character limit range"+ANSI_RESET);

        }
        else {
            System.out.println(ANSI_GREEN+"Validation Pass: website field can be blank"+ANSI_RESET);
        }

        driver.findElement(By.id("btn-submit-profile")).click();
        devTools.disconnectSession();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }

    public static void testMandatoryfields(){
        EdgeDriver driver = new EdgeDriver();
        WebDriverManager.edgedriver().setup();
        DevTools devTools = driver.getDevTools();
        driver.get("https://derivfe.github.io/qa-test/settings");
        driver.manage().window().setSize(new Dimension(974, 1032));
        driver.findElement(By.id("btn-submit-profile")).click();
        System.out.println("Firstname is a mandatory field");
        delayeecution(2000);
        driver.findElement(By.id("fname")).sendKeys("Jane");
        driver.findElement(By.id("btn-submit-profile")).click();
        System.out.println("LastName is a mandatory field");
        delayeecution(2000);

        driver.findElement(By.id("lname")).sendKeys("Doe");
        driver.findElement(By.id("btn-submit-profile")).click();
        System.out.println("Date of Birth is a mandatory field");
        delayeecution(2000);

        driver.findElement(By.id("dob")).click();
        delayeecution(2000);
        driver.findElement(By.id("dob")).sendKeys("2024-01-03");
        driver.findElement(By.id("btn-submit-profile")).click();
        System.out.println("City is a mandatory field");
        delayeecution(2000);

        driver.findElement(By.id("city")).sendKeys("Berlin");
        driver.findElement(By.id("btn-submit-profile")).click();
        System.out.println("State is a mandatory field");
        delayeecution(2000);

        driver.findElement(By.id("state")).sendKeys("State of Brandenburg");
        driver.findElement(By.id("btn-submit-profile")).click();
        System.out.println("Telephone  is a mandatory field");
        delayeecution(2000);

        driver.findElement(By.id("tel")).sendKeys("+971452145214");
        driver.findElement(By.id("btn-submit-profile")).click();
        System.out.println("Email is a mandatory field");

        delayeecution(2000);

        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("btn-submit-profile")).click();
        delayeecution(2000);

        devTools.disconnectSession();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();
    }

public static void senddata(EdgeDriver driver){
    WebDriverManager.edgedriver().setup();
    DevTools devTools = driver.getDevTools();
    driver.get("https://derivfe.github.io/qa-test/settings");
    driver.manage().window().setSize(new Dimension(974, 1032));
    driver.findElement(By.id("salutation")).click();
    {
        WebElement dropdown = driver.findElement(By.id("salutation"));
        dropdown.findElement(By.xpath("//option[. = 'Mrs']")).click();
    }
    driver.findElement(By.id("fname")).click();
    driver.findElement(By.id("fname")).sendKeys("Jane");
    driver.findElement(By.id("lname")).sendKeys("Doe");
    driver.findElement(By.id("dob")).click();
    driver.findElement(By.id("dob")).sendKeys("2023-01-01");
    driver.findElement(By.id("address")).click();
    driver.findElement(By.id("address")).sendKeys("Deriv Technologies Limited Suite 1, Ground Floor, Block D Apex Forbury Road Reading RG1 1AX");
    driver.findElement(By.id("city")).sendKeys("City");
    driver.findElement(By.id("state")).sendKeys("State");
    driver.findElement(By.id("zip")).sendKeys("Zip");
    driver.findElement(By.id("tel")).sendKeys("+123654789");
    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
    driver.findElement(By.id("website")).sendKeys("https://www.deivfe.github.io/qa-test/settings");
    driver.findElement(By.id("btn-submit-profile")).click();
    System.out.print("Validation Pass: Update Profile with data");
    //methods.takesnapshot(driver,devicename);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    devTools.disconnectSession();
    driver.quit();
}

public static void takesnapshot(WebDriver driver, String devicename) {

    try {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS");
        String timestamp = dateFormat.format(new Date());
        String folderPath = "/screenshots/";
        Path folder = Path.of(folderPath);
        Files.createDirectories(folder);
        String filePath = folderPath + devicename + "-"+timestamp + ".png";
        Files.copy(screenshotFile.toPath(), Path.of(filePath), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Screenshot saved: " + filePath);
    } catch (IOException e) {
        System.err.println("Error while taking or saving the screenshot: " + e.getMessage());
    }

}
public static void scrolldown(WebDriver driver, int pixel){
    try {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Scroll down using JavaScript
        jsExecutor.executeScript("window.scrollBy(0, " + pixel + ");");
    } catch (Exception e) {
        System.err.println("Error during scroll down: " + e.getMessage());
    }

}

    public static void delayeecution(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error during delay: " + e.getMessage());
        }

    }

}
