package org.mobisystems.PageUtils.PageObjects;

import org.mobisystems.PageUtils.PageComponents.Footer;
import org.mobisystems.PageUtils.PageComponents.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    } //driver comes from the test
    By footerSection = By.xpath("//body/footer[1]");
    By navBarSection = By.xpath("//header/nav[1]/div[1]");

    public void openHomePage() {
        driver.get("https://pdfextra.com");
    }

    public Footer getFooter(){
        return new Footer(footerSection, driver);
    }

    public NavigationBar getNavigationBar() {
        return new NavigationBar(navBarSection, driver); //driver is passed to NavigationBar Class

    }
}
