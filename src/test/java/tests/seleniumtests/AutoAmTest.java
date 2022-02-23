package tests.seleniumtests;

import base.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AutoAmPage;
import pages.GooglePage;


public class AutoAmTest extends SeleniumBase {
    GooglePage googlePage;
    AutoAmPage autoAmPage;

    @Test(priority = 0)
    public void googleSearch() {
        googlePage = new GooglePage(driver);
        googlePage.searchInput("auto.am");
        googlePage.searchClick();
        googlePage.autoAmLinkClick();
    }

    @Test(priority = 1)
    public void autoAm() {
        autoAmPage = new AutoAmPage(driver);
        autoAmPage.checkAutoAmPageTitle("Ավտոմեքենաների վաճառք Հայաստանում - Auto.am");
        autoAmPage.selectMark("Tesla");
        autoAmPage.selectModel("Model Y");
        autoAmPage.selectYear("2018");
        autoAmPage.customClearedClick();
        autoAmPage.searchBtnClick();
        autoAmPage.checkQuantity("\uE8B6 1");
        autoAmPage.checkPrice("$ 67 000");
    }
}
