package co.evreka.tests;

import co.evreka.pages.LoginPage;
import co.evreka.utilities.BrowserUtils;
import co.evreka.utilities.ConfigurationReader;
import co.evreka.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SearchIphone13_512 {

    LoginPage loginPage = new LoginPage();

    @Test
    public void loginAndSearch() {

        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));
        loginPage.LoginCook.click();
        loginPage.SearchBox.sendKeys(ConfigurationReader.getProperty("SearchKeyword") + Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigurationReader.getProperty("SearchKeyword")));


    }

    @Test
    public void product() {
        loginPage.firstProduct.click();


        for (WebElement eachSize : Driver.getDriver().findElements(By.xpath("//li[starts-with(@id,'size_name_')]"))) {
            eachSize.click();
            BrowserUtils.sleep(1);
            System.out.print(Driver.getDriver().getTitle().substring(6,16));
            System.out.println(" Size:"+loginPage.size.getText());
            System.out.print("Color:"+loginPage.color.getText());
            System.out.println("  Price:"+loginPage.price.getAttribute("innerHTML"));
            System.out.println("Stock:"+loginPage.stock.getText());
            System.out.println("========================================");


        }
    }
    @AfterClass
    public void tearDown(){
        Driver.getDriver().close();
    }



}
