package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    WebDriver driver;

    @FindBy(name = "q")
    WebElement searchField;

    @FindBy(name = "btnK")
    WebElement searchBtn;

    @FindBy(css = "a[href='https://auto.am/']")
    WebElement autoAmLink;


    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchInput(String input) {
        searchField.sendKeys(input);
    }

    public void searchClick() {
        searchBtn.click();
    }

    public void autoAmLinkClick() {
        autoAmLink.click();
    }
}
