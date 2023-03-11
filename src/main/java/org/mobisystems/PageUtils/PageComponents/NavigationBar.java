package org.mobisystems.PageUtils.PageComponents;

import org.mobisystems.PageUtils.AbstractComponents_CommonMethods.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar extends AbstractComponent {

    WebDriver driver;
    public NavigationBar(By navBarSection, WebDriver driver) { //driver comes from HomaPage getNavigationBAr() method
                                                                //in HomePage driver comes from the test
        //driver and navBarSection (that comes from a method in HomePage) are passed to the abstract parent method
        super(navBarSection, driver);  //when construucted , the abstract method will find the navbarsection
        this.driver = driver;
    }

    //this is a page component class
    // contains all methods to handle elements of the Navigation Bar
    //when selenium executes any method of that class, scope of selenium should be in the Navigation Bar only
    // i.e. it will search elements only among the elements of the Navigation Bar

       By languageButton = By.xpath("//a[@id='navbarLangs']");
    By links = By.cssSelector("a");

    public int getLinksCount(){
        return findSectionElements(links).size();
    }
    public void switchLanguage(String lang){
        openDropdown(languageButton);
        driver.findElement(By.xpath("//a[@title='" + lang + "']")).click();
    }



}
