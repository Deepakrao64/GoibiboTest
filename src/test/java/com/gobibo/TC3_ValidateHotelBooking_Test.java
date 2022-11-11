package com.gobibo;

import com.gobibo.pages.HotelsPage;
import com.gobibo.testBase.TestBase;
import org.testng.annotations.Test;

public class TC3_ValidateHotelBooking_Test extends TestBase {

    @Test
    public void validateHotelBooking() {
        initialize();
        HotelsPage hotelsPage = new HotelsPage();
        hotelsPage.clickOnCountryTypeIndiaRadioBtn();
    }
}
