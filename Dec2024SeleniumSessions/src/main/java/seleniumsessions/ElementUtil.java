package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	private WebDriver driver;
	private Actions act;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
	}

	private void nullCheck(CharSequence... value) {
		if (value == null) {
			throw new RuntimeException("===Value can not be null===");
		}
	}

	public void doSendKeys(By locator, String value) {
		nullCheck(value);
		getElement(locator).sendKeys(value);
	}
	
	public void doSendKeys(String locatorType, String locatorValue, String value) {
		nullCheck(value);
		getElement(locatorType, locatorValue).sendKeys(value);
	}

	public void doSendKeys(By locator, CharSequence... value) {
		nullCheck(value);
		getElement(locator).sendKeys(value);
	}
	
	public void doSendKeys(String locatorType, String locatorValue, CharSequence... value) {
		nullCheck(value);
		getElement(locatorType, locatorValue).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public void doClick(String locatorType, String locatorValue) {
		getElement(locatorType, locatorValue).click();
	}
	
	

	public String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("element text =>" + eleText);
		return eleText;
	}

	public String getElementDomAttributeValue(By locator, String attrName) {
		nullCheck(attrName);
		return getElement(locator).getDomAttribute(attrName);
	}

	public String getElementDomPropertyValue(By locator, String propName) {
		nullCheck(propName);
		return getElement(locator).getDomProperty(propName);
	}

	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("element is not present on the page using : " + locator);
			return false;
		}
	}

	public By getBy(String locatorType, String locatorValue) {

		By locator = null;

		switch (locatorType.toUpperCase()) {
		case "ID":
			locator = By.id(locatorValue);
			break;
		case "NAME":
			locator = By.name(locatorValue);
			break;
		case "CLASS":
			locator = By.className(locatorValue);
			break;
		case "XPATH":
			locator = By.xpath(locatorValue);
			break;
		case "CSS":
			locator = By.cssSelector(locatorValue);
			break;
		case "LINKTEXT":
			locator = By.linkText(locatorValue);
			break;
		case "PARTIALLINKTEXT":
			locator = By.partialLinkText(locatorValue);
			break;
		case "TAGNAME":
			locator = By.tagName(locatorValue);
			break;

		default:
			System.out.println("plz pass the right locator type: " + locatorType);
			break;
		}

		return locator;

	}

	public WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	// *********************** findElements Utils****************//
	public List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();// pc=0; []

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				System.out.println(text);
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	public int getElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("element count ==>" + eleCount);
		return eleCount;
	}

	public boolean checkElementDisplayed(By locator) {
		if (getElements(locator).size() == 1) {
			System.out.println("element : " + locator + " is displayed on the page one time");
			return true;
		}
		return false;
	}

	public boolean checkElementDisplayed(By locator, int expElementCount) {
		if (getElements(locator).size() == expElementCount) {
			System.out.println("element : " + locator + " is displayed on the page " + expElementCount + " times");
			return true;
		}
		return false;
	}

	public void clickElement(By locator, String value) {
		List<WebElement> eleList = getElements(locator);
		System.out.println("total number of elements: " + eleList.size());
		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	// ****************Drop Down Utils -- Select based DropDown*********//

	public boolean doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		try {
			select.selectByIndex(index);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println(index + " is not present in the dropdown");
			return false;
		}
	}

	public boolean doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		try {
			select.selectByVisibleText(visibleText);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println(visibleText + " is not present in the dropdown");
			return false;
		}
	}

	public boolean doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		try {
			select.selectByValue(value);
			return true;
		} catch (NoSuchElementException e) {
			System.out.println(value + " is not present in the dropdown");
			return false;
		}
	}

	public boolean selectDropDownValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		boolean flag = false;
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println(value + " is selected");
			return true;
		} else {
			System.out.println(value + " is not selected");
			return false;
		}
	}

	public List<String> getDropDownValueList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		List<String> optionsValList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsValList.add(text.trim());
		}
		return optionsValList;
	}

	public boolean getDropDownValueList(By locator, List<String> expOptionsList) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		List<String> optionsValList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsValList.add(text.trim());
		}

		if (optionsValList.containsAll(expOptionsList)) {
			return true;
		} else {
			return false;
		}
	}

	// *****************drop down utils --- non select based*************//
	/**
	 * this method is used to select the choices with three different use cases: 1.
	 * single selection : selectChoice(choice, choicesList, "choice 3"); 2. multi
	 * selection : selectChoice(choice, choicesList, "choice 1", "choice 2", "choice
	 * 2 3"); 3. all selection: use "all/All" to select all the choices:
	 * selectChoice(choice, choicesList, "ALL");
	 * 
	 * @param choice
	 * @param choicesList
	 * @param choiceValue
	 * @throws InterruptedException
	 */
	public void selectChoice(By choice, By choicesList, String... choiceValue) throws InterruptedException {
		doClick(choice);
		Thread.sleep(2000);
		List<WebElement> choices = getElements(choicesList);
		System.out.println(choices.size());

		if (choiceValue[0].equalsIgnoreCase("all")) {
			// logic to select all the choices:
			for (WebElement e : choices) {
				e.click();
			}
		} else {

			for (WebElement e : choices) {
				String text = e.getText();
				System.out.println(text);

				for (String value : choiceValue) {
					if (text.trim().equals(value)) {
						e.click();
						break;
					}
				}

			}
		}

	}
	
	
	//************Actions Utils************//
	
	public void doMoveToElement(By locator) throws InterruptedException {
		act.moveToElement(getElement(locator)).build().perform();
		Thread.sleep(2000);
	}
	
	public void handleParentSubMenu(By parentMenu, By subMenu) throws InterruptedException {
		doMoveToElement(parentMenu);
		doClick(subMenu);
	}
	
	public void handle4LevelMenuHandle(By level1Menu, By level2Menu, By level3Menu, By level4Menu) throws InterruptedException {
		doClick(level1Menu);
		Thread.sleep(2000);
		doMoveToElement(level2Menu);
		Thread.sleep(2000);
		doMoveToElement(level3Menu);
		Thread.sleep(2000);
		doClick(level4Menu);
	}
	
	public void doActionsSendKeys(By locator, String value) {
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public void doActionsClick(By locator) {
		act.click(getElement(locator)).perform();
	}
	
	public void doSendKeysWithPause(By locator, String value, long pauseTime) {		
		char val[] = value.toCharArray();
		for(char ch : val) {
			act
				.sendKeys(getElement(locator), String.valueOf(ch))
					.pause(pauseTime)
						.perform();
		}
	}
	
	
	

}