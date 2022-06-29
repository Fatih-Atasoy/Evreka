package co.evreka.pages;


import co.evreka.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "sp-cc-accept")
    public WebElement LoginCook;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement SearchBox;

    @FindBy (xpath = "(//div[@data-asin='B09G9PRSHY'])[1]")
    public WebElement firstProduct;

     @FindBy (xpath = "(//span[@class='selection'])[1]")
    public WebElement size;

     @FindBy (xpath = "(//span[@class='selection'])[2]")
    public WebElement color;

     @FindBy (xpath = "//span[@class='a-offscreen']")
    public WebElement price;

     @FindBy (xpath = "//span[@class='a-size-medium a-color-success']")
    public WebElement stock;


     @FindBy (xpath = "//li[starts-with(@id,'size_name_')]")
    public WebElement sizes;







}
