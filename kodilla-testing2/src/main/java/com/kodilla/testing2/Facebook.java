package com.kodilla.testing2;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
    public static final String XPATH_DAY ="//div[contains(@class,\"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH ="//div[contains(@class,\"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR ="//div[contains(@class,\"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select day= new Select(selectDay);
        day.selectByIndex(3);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select month = new Select(selectMonth);
        month.selectByIndex(6);

        WebElement seletYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select year = new Select(seletYear);
        year.selectByIndex(68);
    }
}
