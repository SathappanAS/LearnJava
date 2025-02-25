package seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initBrowser("EDGE");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstName = By.id("input-firstname");
		By lastName = By.name("lastname");
		By emailfield = By.cssSelector("#input-email");
		By telephoneNumber = By.xpath("//*[@id=\"input-telephone\"]");
		By pwdField = By.id("input-password");
		By pwdConfirm = By.name("confirm");

		By subscribeButton = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
		By agreeCheckBox = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By logOutlink = By.xpath("//*[@id=\"column-right\"]/div/a[13]");

		ElementUtil eleUtil = new ElementUtil(driver);

		eleUtil.doSendKeys(firstName, "Divya");
		eleUtil.doSendKeys(lastName, "nangali");
		eleUtil.doSendKeys(emailfield, "divyaregister3@gmail.com");
		eleUtil.doSendKeys(telephoneNumber, "1234567890");
		eleUtil.doSendKeys(pwdField, "123456");
		eleUtil.doSendKeys(pwdConfirm, "123456");
		eleUtil.doClick(subscribeButton);
		eleUtil.doClick(agreeCheckBox);
		eleUtil.doClick(continueButton);

		By accountCreatedText = By.tagName("h1");

		System.out.println("--------------------------------");
		System.out.println("Validation: 1");

		String accountCreatedActText = eleUtil.doElementGetText(accountCreatedText);

		if (accountCreatedActText.contains("Your Account Has Been Created!")) {
			System.out.println("Verified text on page: Your account is created ===PASS===");
			System.out.println("--------------------------------");
		} else {
			System.out.println("Text is not verified on page: Account is not created ===FAIL===");
			System.out.println("--------------------------------");
		}

		System.out.println("Validation: 2");
		String pageTitle = brUtil.getPageTitle();

		if (pageTitle.contains("Your Account Has Been Created!")) {
			System.out.println("Verified Title of page: Your account is created ===PASS===");
			System.out.println("--------------------------------");
		} else {
			System.out.println("PageTitle not verified: Account is not created ===FAIL===");
			System.out.println("--------------------------------");
		}

		System.out.println("Validation: 3");
		String pageUrl = brUtil.getPageURL();

		if (pageUrl.contains("success")) {
			System.out.println("Page url contains success ===PASS===");
			System.out.println("--------------------------------");
		} else {
			System.out.println("Page url doesnot contain success ===FAIL===");
			System.out.println("--------------------------------");
		}

		System.out.println("Validation: 4");

//		try {
//			if (eleUtil.doElementGetText(logOutlink).equalsIgnoreCase("LogOut")) {
//				System.out.println("LogOut link is present...====PASS====");
//
//			} else {
//				System.out.println("LogOut link is not present....====FAIL====");
//			}
//
//		} catch (RuntimeException e) {
//			e.printStackTrace();
//			System.out.println("LogOut is not present....====FAIL====");
//		}
		
//		OR
		
		String logOutText = eleUtil.doElementGetText(logOutlink);
		System.out.println("Logout link text is : " + logOutText);
		
		if(logOutText.toLowerCase().contains("logout")) {
			System.out.println("Logout link is present====PASS====");
			System.out.println("--------------------------------");
			}
		else {
			System.out.println("Logout link is not present====FAIL====");
			System.out.println("--------------------------------");
		}
		brUtil.quitBrowser();
	}	

}
