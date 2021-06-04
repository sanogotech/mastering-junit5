/*
 * (C) Copyright 2017 Boni Garcia (http://bonigarcia.github.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.github.bonigarcia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import com.codeborne.selenide.SelenideDriver;
import io.github.bonigarcia.seljup.SeleniumExtension;


@ExtendWith(SeleniumExtension.class)
public class LocalWebDriverTest {

   @Test
    public void testWithChrome(ChromeDriver chrome) {
        chrome.get("https://bonigarcia.github.io/selenium-jupiter/");

        assertTrue(chrome.getTitle().startsWith("Selenium-Jupiter"));
    }

    //@Test
    public void testWithFirefox(FirefoxDriver firefox) {
        firefox.get("http://www.seleniumhq.org/");

        assertTrue(firefox.getTitle().startsWith("Selenium"));
    }
	

	
	//@Test
    void testSelenide(SelenideDriver driver) {
        driver.open("https://bonigarcia.github.io/selenium-jupiter/");

    }
	
	
	@Test
    void testWithTwoChromes(ChromeDriver driver1, ChromeDriver driver2) {
        driver1.get("http://www.seleniumhq.org/");
        driver2.get("http://junit.org/junit5/");
        //assertThat(driver1.getTitle(), startsWith("Selenium"));
        //assertThat(driver2.getTitle(), equalTo("JUnit 5"));
    }
	
	@Test
	public void testCie(ChromeDriver chrome) {
		// Test name: TestCie
		// Step # | name | target | value
		// 1 | open | / | 
		// chrome.get("https://bonigarcia.github.io/selenium-jupiter/");
		chrome.get("https://www.macieenligne.ci/");
		// 2 | setWindowSize | 1286x824 | 
		chrome.manage().window().setSize(new Dimension(1286, 824));
		
		/*
		// 3 | click | id=inscription | 
		chrome.findElement(By.id("inscription")).click();
		// 4 | click | css=.closesignup > img | 
		chrome.findElement(By.cssSelector(".closesignup > img")).click();
		// 5 | click | linkText=Infos utiles | 
		chrome.findElement(By.linkText("Infos utiles")).click();
		*/
	}

}
