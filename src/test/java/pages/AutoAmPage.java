package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutoAmPage {
    WebDriver driver;

    @FindBy(id = "filter-make")
    WebElement mark;

    @FindBy(id = "v-model")
    WebElement model;

    @FindBy(name = "year[gt]")
    WebElement year;

    @FindBy(className = "lever")
    WebElement customsCleared;

    @FindBy(id = "search-btn")
    WebElement searchBtn;

    @FindBy(id = "research-btn")
    WebElement quantity;

    @FindBy(css = "#ad-2732552 > div.card-action > div > span")
    WebElement price;

    public AutoAmPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkAutoAmPageTitle(String title) {
        Assert.assertEquals(driver.getTitle(), title, "Title not match!!!");
    }

    public void selectMark(String mark_) {
        Select m = new Select(mark);
        m.selectByVisibleText(mark_);
    }

    public void selectModel(String model_) {
        Select m = new Select(model);
        m.selectByVisibleText(model_);
    }

    public void selectYear(String year_) {
        Select y = new Select(year);
        y.selectByValue(year_);
    }

    public void customClearedClick() {
        if (customsCleared.isSelected() == false) {
            customsCleared.click();
        }
    }

    public void searchBtnClick() {
        searchBtn.click();
    }

    public void checkQuantity(String quantity_) {
        Assert.assertEquals(quantity.getText(), quantity_, "False!");
    }

    public void checkPrice(String price_) {
        Assert.assertEquals(price.getText(), price_, "Wrong price!");
    }

}
