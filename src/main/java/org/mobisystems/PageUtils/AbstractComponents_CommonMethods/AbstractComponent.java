package org.mobisystems.PageUtils.AbstractComponents_CommonMethods;

// here we define reusable methods such as a custom findelement() to search only in a section.
//these reusable methods can be used by all page component classes
//we define it abstract class because some methods may be implemented,
// others not and will have to be implemented by the inheriting classes

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractComponent {

    WebElement pageSection;
    WebDriver driver;

    public AbstractComponent(By sectionElement, WebDriver driver) { //driver comes from the child class, who called super constructor of parrent class in it's own constructor
        this.pageSection = driver.findElement(sectionElement);
        this.driver = driver;
    }

    //my custom method findElement()
    public WebElement findSectionElement(By element) {
        return pageSection.findElement(element);
    }

    public List<WebElement> findSectionElements(By element) {
        return pageSection.findElements(element);
    }

    public void openDropdown(By element){
        WebElement dropDownBtn = pageSection.findElement(element);
        dropDownBtn.click();
    }

}
