package com.gobibo.pages;

import com.gobibo.testBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage extends TestBase {
    WebDriver driver;

    @FindBy(xpath="//h4[text()='India']/preceding-sibling::input[@name='CountryType']")
    WebElement countryTypeIndiaRadioBtn;


    public HotelsPage() {
        PageFactory.initElements(webDriver.get(), this);
        driver = webDriver.get();
    }

    public void clickOnCountryTypeIndiaRadioBtn() {
        countryTypeIndiaRadioBtn.click();
    }

}
