package org.mobisystems.PageUtils.PageComponents;

import org.mobisystems.PageUtils.AbstractComponents_CommonMethods.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//this is a page component class
// contains all methods to handle elements of the Footer component
//when selenium executes any method of that class, scope of selenium should be in the Footer only
// i.e. it will search elements only among the elements of the Footer Bar

// in order to search elements only in the Footer we must create a custom findelement() method,
//because if we use the driver.findelement() of selenium, it will search in the whole browser,
//and not in the component only. We want when selenium is working in the Footer,
// to serach only in the Footer.
//That custom findelement() method will search only in a section that we define.
//We shall place it in an abstract class with common reusable methods

public class Footer extends AbstractComponent {

    public Footer (By sectionElement, WebDriver driver) {
        super(sectionElement, driver); //rule: when you inherit a class, you should invoke the parent class consturctor
        // we pass the driver from the test class to this class and then to the parent class via the super constructor
        // we pass the sectionElement from HomePage to Footer class and then to the Abstract class with common methods

    }
    By product = By.xpath("//div[contains(text(),'Продукт')]");
    By link = By.cssSelector("a");


    public WebElement findProduct (){
        return findSectionElement(product);

    }

    public int getLinksCount(){
        return findSectionElements(link).size();
    }
}
