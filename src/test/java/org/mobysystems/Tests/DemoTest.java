package org.mobysystems.Tests;

import org.mobisystems.PageUtils.PageComponents.Footer;
import org.mobisystems.PageUtils.PageComponents.NavigationBar;
import org.mobisystems.PageUtils.PageObjects.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest{

    @Test
    public void findProduct(){
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        WebElement product = homePage.getFooter().findProduct();
        Assert.assertEquals(product.getText(), "Продукт");

        homePage.getNavigationBar().switchLanguage("English");

        Assert.assertEquals(homePage.getNavigationBar().getLinksCount(), 44);
        Assert.assertEquals(homePage.getFooter().getLinksCount(), 26);

    }


}
