import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Calin19May {
    static ChromeDriver chromeDriver;
    private Object color;

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.evomag.ro");
    }

    @AfterAll
    public static void tearDown() {
        chromeDriver.quit();
    }

    @Test
    public void firstTest() {

        WebElement loginIcon = chromeDriver.findElement(
                By.cssSelector("#personal_header > .account_header > .c_header"));
        WebElement loginButton =
                chromeDriver.findElement(By.cssSelector(".BtnLoginHead")); // asa gasim un element

        Actions act = new Actions(chromeDriver);
        act.moveToElement(loginIcon).moveToElement(loginButton).click().perform();

        waitSomeTime(2);

        WebElement emailInput =
                chromeDriver.findElement(By.cssSelector("#LoginClientForm_Email")); // asa gasim un element
        emailInput.sendKeys("bike@bike.com");

        WebElement passwordInput =
                chromeDriver.findElement(By.cssSelector("#LoginClientForm_Password")); // asa gasim un element
        passwordInput.sendKeys("bikebike12");

        waitSomeTime(2);

        WebElement continueButton =
                chromeDriver.findElement(By.cssSelector(".container_principal_dr .butn_form")); // asa gasim un element
        colorTheElementInRed(continueButton); // coloreaza
        waitSomeTime(2);
        continueButton.click();

        waitSomeTime(6);

    }


    @Test
    public void test2 (){
        List<WebElement> categorii = chromeDriver.findElements(By.cssSelector(".index-category-menu > li"));

        for (WebElement categorie : categorii) {
            colorTheElementInRed(categorie);
            waitSomeTime(1);
        }
    }

    @Test
    public void test3 (){
        List<WebElement> categorii = chromeDriver.findElements(By.cssSelector(".index-category-menu > li"));

        for (WebElement categorie : categorii) {
            colorTheElementInRed(categorie);
            waitSomeTime(1);

            if (categorie.getText().equals("Imprimante")){
                categorie.click();
                break;
            }
            else {
                colorTheElement(categorie, "blue");
                waitSomeTime(1);
            }
        }

        String pageTitle = chromeDriver.getTitle();
        Assertions.assertEquals("Imprimante - evoMAG.ro", pageTitle);

        WebElement title= chromeDriver.findElement(By.cssSelector(".breadcrumbs"));
        Assertions.assertTrue(title.isDisplayed());
        Assertions.assertTrue(title.getText().contains("Imprimante"));
    }

    private void colorTheElementInRed(final WebElement webElement) {

        chromeDriver.executeScript("arguments[0].style.border='3px solid red'", webElement);
    }
    public void colorTheElement(final WebElement webElement, String color) {

        chromeDriver.executeScript(
                String.format("arguments[0].style.border='3px solid %s'", color), webElement);
    }
    public void waitSomeTime(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}